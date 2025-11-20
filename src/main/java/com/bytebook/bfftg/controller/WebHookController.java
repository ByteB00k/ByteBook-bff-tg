package com.bytebook.bfftg.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class WebHookController {

    @PostMapping("/bot")
    public ResponseEntity<String> onUpdateReceived(@RequestBody String update) {
        log.info("Получен update: {}", update);
        return ResponseEntity.ok("OK");
    }


}
