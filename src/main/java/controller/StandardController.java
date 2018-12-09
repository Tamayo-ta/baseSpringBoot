package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoints")
public class StandardController {
    Logger logger = LoggerFactory.getLogger(StandardController.class);

    @GetMapping("/greetings")
    public String greetings(@RequestParam("name") String name){
        logger.info("Request received");
        return "Hello " + name;
    }
}
