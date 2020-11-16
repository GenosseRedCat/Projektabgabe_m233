package io.jason.controls;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //POST, GET, DELETE (R.E.S.T)
public class AccessController {

    @RequestMapping("/welcome") //Signalisiert, dass bei /welcome doese Nachricht kommt.
    public String welcomeMessage(){
        return "Welcome to the spring-powered PunchClock!";
    }

}
