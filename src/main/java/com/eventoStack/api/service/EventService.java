package com.eventoStack.api.service;

import com.eventoStack.api.domain.event.Event;
import com.eventoStack.api.domain.event.EventRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class EventService {
    public Event createEvent(EventRequestDTO data) {
        String imageUrl = null;
        if (data.image() != null) {
            this.uploadImage(data.image());
        }
        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.eventUrl());
        newEvent.setDate(new Date(data.date()));
        newEvent.setImageUrl(imageUrl);
        return newEvent;
    }

    ;

    private String uploadImage(MultipartFile image) {
        return "";
    }

    ;
}
