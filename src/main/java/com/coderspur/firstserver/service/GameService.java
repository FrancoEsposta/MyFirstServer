package com.coderspur.firstserver.service;

import com.coderspur.firstserver.model.Game;
import com.coderspur.firstserver.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    private final GameRepository repository = new GameRepository();
    public List<Game> getAllGames() {
        return repository.getGames();
    }

    public void addGame(Game game) {
        repository.addGame(game);
    }
}
