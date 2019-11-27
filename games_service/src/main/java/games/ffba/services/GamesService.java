package games.ffba.services;

import games.ffba.dao.SQLDao;
import games.ffba.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GamesService {

    @Autowired
    private SQLDao dao;

    public Collection<Game> getAll() {
        return this.dao.getAll();
    }

    public void insert(Game game) {
        this.dao.put(game);
    }
}
