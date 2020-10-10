package sportive.com.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1")
public class Greeting {

    @GetMapping
    @RequestMapping(path = "msg")
    public String message(){
        return "Hello World";
    }
}
