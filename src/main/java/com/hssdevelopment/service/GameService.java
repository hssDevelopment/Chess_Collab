package com.hssdevelopment.service;

import com.hssdevelopment.domain.Game;
import com.hssdevelopment.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * Created by mhensley on 12/27/16.
 */

@Service
@Transactional
public class GameService {

    private GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    public Game createNewGame() {
        Game newGame = new Game();
        newGame.setUuid(UUID.randomUUID().toString());
        return newGame;
    }

    public Game saveGame(Game game){
        return gameRepository.save(game);
    }
}
