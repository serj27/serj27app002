package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by serjd on 10.10.2016.
 */
@Controller
public class Home {

    @RequestMapping(value = "/")

    public String home(){
        return "test";
    }
}
