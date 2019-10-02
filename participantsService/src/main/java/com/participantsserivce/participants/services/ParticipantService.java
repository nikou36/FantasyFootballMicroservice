package com.participantsserivce.participants.services;

import com.participantsserivce.participants.dao.FakeDao;
import com.participantsserivce.participants.dao.SQLDao;
import com.participantsserivce.participants.entities.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
//A service that extracts data from the SQL database.
@Service
public class ParticipantService {

    @Autowired
    private SQLDao dao;
    //private FakeDao dao; // uncomment for debugging HTTP requests.
/*
TO DO: Handle updates, deletions, insertions, etc
 */

    public Collection<Participant> getAll() {
        return this.dao.getAll();
    }

}
