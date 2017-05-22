package pl.sdacademy;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

public class SecureFilter implements Filter {

    public void init (FilterConfig config) throws ServletException {}

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        String ipAddress = servletRequest.getRemoteAddr();
        System.out.println("IP: " + ipAddress + " , Time " + new Date().toString());

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
