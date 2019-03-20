package com.akshatha.spring.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akshatha.spring.dto.TharakariDTO;

@Controller
@RequestMapping("/")
public class TharakariController {
	
	List <TharakariDTO> list = new ArrayList<TharakariDTO>();
public TharakariController() {
	System.out.println("created : \t" + this.getClass().getSimpleName());
}

@RequestMapping("/order")
public String placeOrder(TharakariDTO dto,ModelMap model) {
	return pageReturn(dto, model);
	
}


private String pageReturn(TharakariDTO dto, ModelMap model) {
	System.out.println("placeOrder is invoked .. \t");
	list.add(dto);
	System.out.println("list details : \t" + list);
	model.addAttribute("Success", "Your order is placed \t");
	return "/index.jsp";
}
@RequestMapping("/display")
public String displayingOrder(ModelMap model) {
	System.out.println("invoked displayingOrder...\t");
	System.out.println(list);
	model.addAttribute("listItems" ,list);
	return "/display.jsp";
}

@InitBinder
public void initBinder(WebDataBinder binder) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	dateFormat.setLenient(false);
	binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));

}
}
