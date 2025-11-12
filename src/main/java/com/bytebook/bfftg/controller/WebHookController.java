package com.bytebook.bfftg.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebHookController {

    @PostMapping("/bot")
    public ResponseEntity<String> onUpdateReceived(@RequestBody String update) {
        System.out.println("Получен update: " + update);
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/bot")
    public String test() {
        return "Webhook endpoint is alive!";
    }

}
