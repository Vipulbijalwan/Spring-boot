

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

@GetMapping("/prompt")
    public  String promptResponse(){
     return "responseView";
    }
}
