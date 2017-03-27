package bq.netflix.zuul;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
 * Created on 3/16/17 6:23 PM 
 */
@Configuration
@EnableZuulProxy
@ComponentScan(basePackages = "bq.netflix.zuul")
public class ZuulConfiguration {



}
