package com.participantsserivce.participants.controllers;

import com.participantsserivce.participants.entities.Participant;
import com.participantsserivce.participants.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Collection;

/*
TO DO: HANDLE UPDATES, DELETIONS, INSERTIONS ETC.
 */


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/participants")
public class RestController {

    @Autowired
    private ParticipantService service;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Participant> getAllParticipants() {
        return service.getAll();
    }
}
