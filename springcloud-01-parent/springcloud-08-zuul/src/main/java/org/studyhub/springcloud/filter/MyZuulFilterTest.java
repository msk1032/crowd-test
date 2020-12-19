package org.studyhub.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author haoren
 * @create 2020-12-16 9:44
 */
@Component
public class MyZuulFilterTest extends ZuulFilter {

    //判断当前请求是否过滤
    @Override
    public boolean shouldFilter() {
        //1.通过RequestContext获取当前的请求对象
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();

        String param = request.getParameter("signal");

        return "hello".equals(param);
    }


    @Override
    public String filterType() {
        String filterType = "pre";

        return filterType;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public Object run() throws ZuulException {

        //当前实现 会忽略此方法的返回值 不做特殊处理
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!run()方法执行了");
        return null;
    }
}
