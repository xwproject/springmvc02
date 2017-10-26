package com.zhidi.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

import com.zhidi.entity.User;

@Controller
@RequestMapping("/requestparam")
public class RequestParamBindController {
	
	@RequestMapping("/byrequest")
	public String byRequest(HttpServletRequest req){
		req.setAttribute("username", "ÀÏÕÅ¾ý");
		return "index";
	}
	@RequestMapping("/byresponse")
	public void byResponse(HttpServletResponse resp) throws IOException{
		
		/*resp.setCharacterEncoding("utf-8");*/
		resp.setContentType("application/json");
		PrintWriter out = resp.getWriter();
		out.println("{\"username\":\"ºÇºÇ\",\"password\",\"123456\",\"age\":\"18\"}");
		out.flush();
		out.close();
	}
	@RequestMapping("/bysession")
	public String bysession(HttpSession session) {
		session.setAttribute("admin", "123");
		return "index";
	}
	@RequestMapping("/bymodel")
	public String bymodel(Model model) {
		model.addAttribute("model", "ÄãºÃ°¡");
		
		return "index";
	}
	@RequestMapping("/bymodelmap")
	public String bymodelmap(ModelMap mm) {
		mm.addAttribute("modelmap", "helloworld!!!");
		
		return "index";
	}
	@RequestMapping("/bystring")
	public String byString(String name){
		System.out.println(name);
		return "index";
	}
	@RequestMapping("/bypojo")
	public String bypojo(User user){
		System.out.println(user);
		return "index";
	}
	@RequestMapping("/delete")
	public String bydelete(@RequestParam(value="uuid",required=false,defaultValue="100") Integer id){
		System.out.println(id);
		return "index";
	}
	@RequestMapping("/date")
	public String toLogin(@DateTimeFormat(pattern="yyyy-MM-dd")Date date){
		System.out.println(date);
		return "index";
	}
	@RequestMapping("/toregister")
	public String toRegister(){
		
		return "register";
	}
	@RequestMapping("/tologin")
	public String toLogin(User user){
		System.out.println(user);
		return "index";
	}
	@RequestMapping("/{date},{time}/{id}/index/{name}")
	public String urlParam(@PathVariable("date")Date date,
			@PathVariable("time")String momnet,
			@PathVariable("id")Integer id,
			@PathVariable("name")String name){
		/*int a=10/0;
		System.out.println(a);*/
		System.out.println(date);
		System.out.println(momnet);
		System.out.println(id);
		System.out.println(name);
		return "index";
	}
	
}