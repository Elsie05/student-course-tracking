package com.hua.utils;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns= {"/*"},initParams= {
		@WebInitParam(name="exclude",value="/login.jsp,/login,/noprivilige.jsp,.css,.png,.jpg,.js")
})
public class PermissionFilter implements Filter {

	public static String excludeString ;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		excludeString = filterConfig.getInitParameter("exclude");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		Object user = httpServletRequest.getSession().getAttribute("user");
		String uri = httpServletRequest.getRequestURI();
		if(isExist(uri) || uri.equals(httpServletRequest.getContextPath()+"/")) {
			if(user != null && (uri.endsWith("/login.jsp") || uri.endsWith("/login") || uri.equals(httpServletRequest.getContextPath()+"/"))) {
				httpServletResponse.sendRedirect("index.jsp");
				return;
			}
			chain.doFilter(httpServletRequest, httpServletResponse);
		}else {
			if(user != null) {
				chain.doFilter(httpServletRequest, httpServletResponse);
			}else {
				httpServletResponse.sendRedirect("noprivilige.jsp");
			}
		}
	}
	
	public static boolean isExist(String uri) {
		//最后url的结尾与exclude匹配
		String[] arr = excludeString.split(",");
		boolean flag = false;
		for (String string : arr) {
			if(uri.endsWith(string)) {
				flag = true;
			}
		}
		return flag;
	}
	

	@Override
	public void destroy() {

	}

}

