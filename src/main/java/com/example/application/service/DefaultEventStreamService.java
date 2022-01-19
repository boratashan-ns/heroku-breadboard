package com.example.application.service;

import com.example.application.data.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultEventStreamService implements EventStreamService {

    @Autowired
    private DataClient dataClient;


    @Override
    public EventStreamService consumeEventStreamPayload(String payload) {

        System.out.println("EVENT STREAM -> "+payload);
        return this;
    }
}
