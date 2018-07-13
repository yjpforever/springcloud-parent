package com.yjp.springcloud.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * Created by yjp on 2018/7/9.
 */
@Component
public class MyFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if(token==null){
            try {
                requestContext.setSendZuulResponse(false);
                requestContext.setResponseStatusCode(401);
                requestContext.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                return null;
            }
        }
        return null;
    }
}
