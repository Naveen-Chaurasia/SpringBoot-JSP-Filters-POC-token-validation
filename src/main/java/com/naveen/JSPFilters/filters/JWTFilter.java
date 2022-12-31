package com.naveen.JSPFilters.filters;

import java.io.IOException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.GenericFilter;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class JWTFilter extends GenericFilter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		    final HttpServletRequest request1 = (HttpServletRequest) request;
	        final HttpServletResponse response1 = (HttpServletResponse) response;
	        final String authHeader = ((HttpServletRequest) request).getHeader("authorization");
	        
	        
	        if ("OPTIONS".equals(request1.getMethod()))
	        {
	            response1.setStatus(HttpServletResponse.SC_OK);
	            chain.doFilter(request, response);
	        }
	        else 
	        {
	            if (authHeader == null || !authHeader.startsWith("Bearer "))
	            {
	                throw new ServletException("Missing or invalid Authorization header");
	            }
	            
	            final String token = authHeader.substring(7);
	            final Claims claims = Jwts.parser()
	                    .setSigningKey("secretkey")
	                    .parseClaimsJws(token)
	                    .getBody();
	            request.setAttribute("claims", claims);
	            chain.doFilter(request, response);
	        }
	}
	        
	}
	

