package games.ffba.controllers;

import games.ffba.entities.Game;
import games.ffba.services.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.RequestWrapper;
import java.util.Collection;

@RequestMapping("/participants")
public class RestController {

    @Autowired
    private GamesService service;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Game> getGames() {
        return service.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addParticipant(@RequestBody Game game) {
        service.insert(game);
    }
}
