package spring.web.app.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ApiException {
    int status;
    String message;
    long timestamp;
    String path;
    public ApiException(int status, String message, String path){
        this.status = status;
        this.message = message;
        this.path = path;
        this.timestamp = new Date().getTime();
    }
}
