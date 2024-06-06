package co.develhope.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/devName")
    public String readDevName() {
        return "Aurora";
    }
}