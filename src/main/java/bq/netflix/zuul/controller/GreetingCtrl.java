package bq.netflix.zuul.controller;

import bq.netflix.zuul.modal.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
 * Created on 3/24/17 2:16 PM 
 */
@RestController
public class GreetingCtrl {

    @RequestMapping(method = RequestMethod.GET, path = "/greet")
    public Greeting greet(@RequestParam("name")  String name) {

        if( name.equalsIgnoreCase("badguy")) {
            throw new IllegalArgumentException("Bad User Name!");
        }

        Greeting g = new Greeting();
        g.setMessage("hello!");
        g.setName(name);
        return g;
    }

}
