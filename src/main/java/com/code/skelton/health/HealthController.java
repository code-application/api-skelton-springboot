package com.code.skelton.health;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @ResponseStatus(code = HttpStatus.OK, value = HttpStatus.OK)
    @GetMapping("/healthz")
    public String healthCheck() {
        return "OK";
    }
}
