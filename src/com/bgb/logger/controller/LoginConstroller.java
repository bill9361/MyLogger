package com.bgb.logger.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bgb.logger.model.Result;
import com.bgb.logger.model.User;

@RequestMapping("/login")
@Controller
//@SessionAttributes(value="email")
@SessionAttributes(types=String.class)
public class LoginConstroller
{

	@RequestMapping(value = "/login/{user}.do", method = RequestMethod.GET)
	public ModelAndView myMethod(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("user") String user, ModelMap modelMap) throws Exception
	{
		System.out.println("user:"+user);
		modelMap.put("loginUser", user);
		//跳转到/WEB-INF/view/下的login/hello.jsp
		return new ModelAndView("login/hello", modelMap);
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String registPost()
	{
		System.out.println("welcome");
		return "/welcome";
	}

	@RequestMapping("/welcome1")
	public ModelAndView message()
	{
		String message = "Hello World, Spring 3.0!!!";
		System.out.println(message);
		//创建ModelAndView对象，并设置跳转地址(第一个参数对应跳转地址，第二个参数是数据的key，第三个参数是value)
		return new ModelAndView("message", "message1", message);
	}
	
	@RequestMapping("/testPathVar/{id}")
	public String testPathVar(@PathVariable("id") Integer id)
	{
		System.out.println("id:"+id);
		return "welcome";
	}
	
	//ResponseBody 解决JSPs only permit GET POST or HEAD的问题
	@ResponseBody
	@RequestMapping(value="/testMethodDelete/{id}", method=RequestMethod.DELETE)
	public String testMethodDelete(@PathVariable("id") Integer id)
	{

		System.out.println("delete-id:"+id);
		return "welcome";
	}
	
	@RequestMapping(value="/testRequestParam",method=RequestMethod.POST)
	public String testRequestParam(@RequestParam(value="id",required=true) Integer id,@RequestParam("name") String name)
	{

		System.out.println("testRequestParam-id:"+id);

		System.out.println("testRequestParam-name:"+name);
		return "welcome";
	}
	
	@RequestMapping(value="/testPojo",method=RequestMethod.POST)
	public String testPojo(User user)
	{
		System.out.println(user);
		return "welcome";
		
	}
	
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader("Accept") String a,@RequestHeader("Accept-Language") String b)
	{

		System.out.println(a);
		System.out.println(b);
		return "welcome";
	}

	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String jsessionid)
	{

		System.out.println(jsessionid);
		return "welcome";
	}
	

	@RequestMapping("/testServletAPI")
	public String testServletAPI(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println(request);
		System.out.println(response);
		return "welcome";
	}

	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("welcome");
		//将模型数据的值放到Request范围当中
		modelAndView.addObject("name", "Tom");
		return modelAndView;
	}
	

	@RequestMapping("/testMap")
	public String testMap(HttpServletRequest request,HttpServletResponse response,Map<String,Object> map)
	{
		//将模型数据的值放到Request范围当中
		map.put("name", "Tom1");
		map.put("age", 30);
		return "welcome";
	}
	

	@RequestMapping("/testModel")
	public String testModel(HttpServletRequest request,HttpServletResponse response,Model model)
	{
		//将模型数据的值放到Request范围当中
		model.addAttribute("email", "mbfeng@bgb.com.cn");
		return "welcome";
	}

	@RequestMapping("/testModelMap")
	public String testModelMap(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap)
	{
		//将模型数据的值放到Request范围当中
		modelMap.addAttribute("email1", "991724847@qq.com");
		return "welcome";
	}

	@RequestMapping("/testSessionAttribute")
	public String testSessionAttribute(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("testSessionAttribute()");
		return "result";
	}
	
	/**
	 * GET请求登录方式
	 * @param request
	 * @param response
	 * @param userName
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/appLogin/{userName}/{password}")
	@ResponseBody
	public Result<User> appLogin(HttpServletRequest request,HttpServletResponse response,
			@PathVariable("userName") String userName,@PathVariable("password") String password)
	{
		System.out.println("访问了appLogin()");
		return getLoginReslut(userName, password);
		
	}
	
	/**
	 * GET请求参数登录方式
	 * @param request
	 * @param response
	 * @param userName
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/appLoginGetParam")
	@ResponseBody
	public Result<User> appLoginGetParam(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("访问了appLoginGetParam()");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		return getLoginReslut(userName, password);
	}

	/**
	 * POST请求登录方式
	 * @param request
	 * @param response
	 * @param userName
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/appLoginPost",method=RequestMethod.POST)
	@ResponseBody
	public Result<User> appLoginPost(HttpServletRequest request,HttpServletResponse response,@CookieValue("JSESSIONID") String jsessionid)
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String deviceId = request.getHeader("DeviceId");
		//String jsessionId = request.getHeader("JSESSIONID");
		System.out.println("访问了appLoginPost()");
		//@CookieValue("JSESSIONID") String jsessionId,
		//@RequestHeader("Accept-Language") String acceptlanguage
		//System.out.println("Accept-Language："+acceptlanguage);
		System.out.println("DeviceId："+deviceId);
		System.out.println("JSESSIONID："+jsessionid);
		
		
		return getLoginReslut(userName, password);
	}
	
	/**
	 * 获取登录结果
	 */
	private Result<User> getLoginReslut(String userName,String password)
	{

		System.out.println("userName:"+userName+"\tpassword:"+password);
		
		Result<User> result = new Result<>();
		
		if("root".equals(userName) && "888888".equals(password))
		{
			result.setSuccess(true);
			/*User user = new User();
			user.setId("0123456789");
			user.setUserName("root");
			user.setFullName("张三");
			user.setPassword("123456");
			result.setData(user);*/
			System.out.println("登录成功");
		}
		else
		{
			result.setSuccess(false);
			result.setMessage("用户名或密码错误");
			System.out.println("用户名或密码错误");
		}
		
		
		return result;
	}
	
	/**
	 * POST获取用户信息
	 * @param request
	 * @param response
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/getUserInfo",method=RequestMethod.POST)
	@ResponseBody
	public Result<User> getUserInfo(HttpServletRequest request,HttpServletResponse response,
			@RequestParam("userId") String userId)
	{
		System.out.println("访问了appLoginPost2():userId:"+userId);
		
		Result<User> result = new Result<>();
		
		if("0123456789".equals(userId))
		{
			result.setSuccess(true);
			User user = new User();
			/*user.setId("0123456789");
			user.setUserName("root");
			user.setFullName("张三");
			user.setPassword("123456");*/
			result.setData(user);
		}
		else
		{
			result.setSuccess(false);
		}
		
		return null;
	}
	
}

