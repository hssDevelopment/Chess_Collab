package com.hssdevelopment.rest;

import com.hssdevelopment.domain.Game;
import com.hssdevelopment.domain.Player;
import com.hssdevelopment.dto.NewGame;
import com.hssdevelopment.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mhensley on 12/27/16.
 */

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping(value= "/new", method=RequestMethod.POST)
    public NewGame createNewGame(@RequestBody List<Player> players){

        if(players.size() != 2){
            throw new IllegalArgumentException("There can only be two players");
        }

        Game game = gameService.createNewGame();
        game.setPlayers(players);
        game = gameService.saveGame(game);

        NewGame newGame = new NewGame();
        newGame.setId(game.getId());
        newGame.setToken(game.getUuid());
        newGame.setPlayers(game.getPlayers());

        return newGame;
    }

}
