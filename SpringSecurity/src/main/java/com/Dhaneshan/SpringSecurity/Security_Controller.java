package com.Dhaneshan.SpringSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Security_Controller
{
   @RequestMapping("/")
   public String Welcome()
   {
	   return "index.jsp";
	   
   }
}
