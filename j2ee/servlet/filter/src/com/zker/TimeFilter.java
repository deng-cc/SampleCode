package com.zker;

import javax.servlet.*;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * TimeFilter.
 *
 * @author Dulk
 * @version 20170605
 * @date 17-6-5
 */
public class TimeFilter implements Filter {
    private int start = 0;
    private int end = 24;

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("TimeFilter初始化，开始抓取初始化参数");
        start = Integer.parseInt(filterConfig.getInitParameter("start"));
        end = Integer.parseInt(filterConfig.getInitParameter("end"));
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("TimeFilter过滤");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int curHour = calendar.get(Calendar.HOUR_OF_DAY);
        if (curHour >= end || curHour < start) {
            request.setAttribute("start", start);
            request.setAttribute("end", end);
            request.getRequestDispatcher("/WEB-INF/notice.jsp").forward(request, response);
        }
        
        chain.doFilter(request, response);
    }

    public void destroy() {
        System.out.println("TimeFilter爆炸");
    }
}
