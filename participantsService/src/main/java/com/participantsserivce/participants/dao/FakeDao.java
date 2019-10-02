package com.participantsserivce.participants.dao;

import com.participantsserivce.participants.entities.Participant;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
/*
A temporary and static repository used for debugging. Does not effect the final project
 */
@Repository
public class FakeDao {
    private static HashMap<Integer,Participant> participants;// Fake database represented by a HashMap

    public FakeDao(){
        participants = new HashMap<Integer, Participant>();
        participants.put(1, new Participant("james", 2019,"champion"));
        participants.put(2, new Participant("frank", 2019,"DNQ"));
        participants.put(3, new Participant("nick", 2019,"runner up"));
    }

    public Collection<Participant> getAll() {
        return this.participants.values();
    }
}
