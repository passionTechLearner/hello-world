package sportive.com.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1")
public class GreetingFromUrl {

    @GetMapping("/msg/foo")
    public String message(@RequestParam String msg ){
        return "Hello World :" + msg;
    }
}
