package bq.netflix.zuul.filter;

import bq.netflix.zuul.filter.constants.BQConstants;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

/**
 * <b>  </b>
 *
 * <p>
 *     zuul is
 *
 * </p>
 *
 * @author Jonathan.q.bo@gmail.com
 * @version v1
 *
 * Created on 3/17/17 9:57 AM
 */
@Component
public class ExceptionFilter1 extends ZuulFilter {

    public String filterType() {
        return BQConstants.ZUUL_FILTER_TYPE_EXCERPTION;
    }

    public int filterOrder() {
        return 1;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() {
        System.out.println("Doing Exception Filter 1 ");

        String name = RequestContext.getCurrentContext().getRequestQueryParams().get("name");
        if(name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if(name.equalsIgnoreCase("badguy")){
            throw new IllegalArgumentException("you are a bad guy!");
        }

        return null;
    }
}
