package pl.sdacademy;


import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

public class LogFilter implements Filter {

    final static Logger logger = Logger.getLogger(LogFilter.class);

    public void init(FilterConfig config) throws ServletException {}

    public void doFilter(ServletRequest req,
                         ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {

        String ipAddress = req.getRemoteAddr ();
        logger.error("IP: " + ipAddress + " , Time " + new Date().toString());

        chain.doFilter(req, resp);
    }

    public void destroy() {}
}
