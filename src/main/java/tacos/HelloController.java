package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HelloController {

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    @ResponseBody
    public String requestMethodName(@RequestParam String name, @RequestParam int age) {
        return String.format("Hello, %s.\nYour age is %d", name, age);
    }    
}
