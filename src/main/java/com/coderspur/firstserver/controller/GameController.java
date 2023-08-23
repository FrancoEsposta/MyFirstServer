package com.coderspur.firstserver.controller;

import com.coderspur.firstserver.model.Game;
import com.coderspur.firstserver.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    private final GameService service = new GameService();

    @GetMapping("/games")
    public ResponseEntity<List<Game>> getGames() {
        return ResponseEntity.ok(
                service.getAllGames()
        );
    }

    @PostMapping("/games")
    public ResponseEntity<Game> addGame(@RequestBody Game game) {

        service.addGame(game);

        return ResponseEntity.ok(
                game
        );
    }
}
