package com.zrk1000;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping(value={"/","/index"})
	@ResponseBody
	public String index(HttpServletRequest request, HttpServletResponse response){
		
		AttributePrincipal principal = (AttributePrincipal)request.getUserPrincipal();
		
		String result = "sessionId:"+request.getSession().getId()+"</br>";
		result += "request.getRemoteUser():"+request.getRemoteUser()+"</br>";
		result += "request.getUserPrincipal():"+request.getUserPrincipal()+"</br>";
		result += "principal.getName():"+principal.getName()+"</br>";
		if(principal!=null){
			Map<String,Object> map = principal.getAttributes();
			for (String key : map.keySet()) {
				result += key+"  :  "+map.get(key)+"</br>";
			}
			
		}
		return "execute index method </br>"+result;
	}
	@RequestMapping("/test")
	@ResponseBody
	public String test(HttpServletRequest request, HttpServletResponse response){
		AttributePrincipal principal = (AttributePrincipal)request.getUserPrincipal();
		String result = "sessionId:"+request.getSession().getId()+"</br>";
		result += "request.getRemoteUser():"+request.getRemoteUser()+"</br>";
		result += "request.getUserPrincipal():"+request.getUserPrincipal()+"</br>";
		result += "principal.getName():"+principal.getName()+"</br>";
		if(principal!=null){
			Map<String,Object> map = principal.getAttributes();
			for (String key : map.keySet()) {
				result += key+"  :  "+map.get(key)+"</br>";
			}
			
		}
		return "execute test method </br>"+result;
	}

}
