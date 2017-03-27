package bq.netflix.zuul.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

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
 * Created on 3/27/17 10:33 AM 
 */
@RestControllerAdvice
public class BQExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Message handleBadRequest(Exception e) {
        Message msg = new Message();
        msg.setId("400");
        msg.setName("BAD_REQUEST");
        msg.setDetail(e.getMessage());
        return msg;
    }


}
