package com.mahesh.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AmazonProduct 
{
	@RequestMapping("/")
	public String billForm()
	{
		return "billinvoice";
	}
	@RequestMapping("/request")
	public String getElectricityBill(@RequestParam int cid,@RequestParam String cname,@RequestParam long mno,@RequestParam String pname,@RequestParam double price,@RequestParam int quantity,ModelMap model)
	{
		model.put("cid", cid);
		model.put("cname", cname);
		model.put("mno", mno);
		model.put("pname", pname);
		model.put("price", price);
		model.put("quantity", quantity);

		double totalAmount = price * quantity;
		double discountAmount = 0.0,gst = totalAmount * 0.18,invoiceBill = 0.0;
		
		
		if(totalAmount < 2500)
		{
			discountAmount = totalAmount * 0.10;
		}
		else if(totalAmount >= 2500 && totalAmount <5000)
		{
			discountAmount = totalAmount * 0.15;
		}
		else if(totalAmount >= 5000)
		{
			discountAmount = totalAmount * 0.30;
		}
		invoiceBill = (totalAmount-discountAmount)+gst;
		
		model.put("totalAmount", totalAmount);
		model.put("discountAmount", discountAmount);
		model.put("gst", gst);
		model.put("invoiceBill", invoiceBill);
		return "result";
	}
}
