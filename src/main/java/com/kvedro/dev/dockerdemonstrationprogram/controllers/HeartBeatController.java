package com.kvedro.dev.dockerdemonstrationprogram.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heartbeat")
public class HeartBeatController {

    @GetMapping()
    public ResponseEntity getHartbBeat(){
        return ResponseEntity.ok(System.currentTimeMillis());
    }

}
