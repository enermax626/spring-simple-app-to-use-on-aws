package com.baeldung.filtersinterceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HealthCheckController {

    private Logger logger = LoggerFactory.getLogger(HealthCheckController.class);

    @GetMapping()
    public ResponseEntity<String> healthCheck() {
        logger.info("Hello from the controller");
        return ResponseEntity.ok("Hello from a build made with AWS CodePipeline");
    }

}
