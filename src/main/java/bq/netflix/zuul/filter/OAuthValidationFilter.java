package bq.netflix.zuul.filter;

import bq.netflix.zuul.filter.constants.BQConstants;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;
import org.springframework.stereotype.Component;

/**
 * <b>  </b>
 * 
 * <p>
 * 
 * </p>
 *
 * @author Jonathan.q.bo@gmail.com
 * @version v1
 * 
 * Created on 3/17/17 9:26 AM 
 */
@Component
public class OAuthValidationFilter extends ZuulFilter{

    public String filterType() {
        return BQConstants.ZUUL_FILTER_TYPE_PRE;
    }

    public int filterOrder() {
        return 1;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() {
        System.out.println("Doing OAuth Validation.");
        return null;
    }
}


