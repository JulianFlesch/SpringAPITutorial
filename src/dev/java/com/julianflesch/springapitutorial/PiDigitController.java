package com.julianflesch.springapitutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PiDigitController {

    @RequestMapping("/pidigit")
    public PiDigit piDigit(@RequestParam(value="index", defaultValue="1") int idx) {
        return new PiDigit(idx);
    }

}