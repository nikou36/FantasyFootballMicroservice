package com.participantsserivce.participants.controllers;

import com.participantsserivce.participants.entities.Participant;
import com.participantsserivce.participants.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.awt.*;
import java.util.Collection;

/*
TO DO: HANDLE UPDATES, DELETIONS, INSERTIONS ETC.
 */


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/participants")
public class RestController {

    @Autowired
    private ParticipantService service;

    //Get Participant data from database
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Participant> getAllParticipants() {
        return service.getAll();
    }

    //Insert Participant data to database
    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addParticipant(@RequestBody Participant participant) {
        service.insert(participant);
    }


}
