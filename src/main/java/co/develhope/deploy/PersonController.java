package co.develhope.deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Value("${devName}")
    private String devName;

    @GetMapping
    public String readDevName() {
        return devName;
    }
}