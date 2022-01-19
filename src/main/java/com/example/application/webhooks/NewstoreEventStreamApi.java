package com.example.application.webhooks;

import com.example.application.data.DataClient;
import com.example.application.service.EventStreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class NewstoreEventStreamApi {

    @Autowired
    private DataClient dataClient;

    @Autowired
    private EventStreamService eventStreamService;

    @GetMapping("/webhook/health")
    public ResponseEntity<String> checkHealth() {
        return ResponseEntity.ok("Running...");
    }


    @GetMapping("/webhook/healthsec")
    public ResponseEntity<String> checkSecureHealth() {
        return ResponseEntity.ok("Secure running...");
    }

    @PostMapping("/webhook/event")
    public ResponseEntity<String> webhookEvent(@RequestBody(required = false) String payload) {
        eventStreamService.consumeEventStreamPayload(payload);
        return ResponseEntity.ok().build();
    }





}
