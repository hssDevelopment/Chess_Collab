package com.hssdevelopment.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mhensley on 12/27/16.
 */

@Entity
public class Game extends AbstractEntity {

    private String uuid;

    private Calendar startTime;

    private Long winningPlayerId;

    @OneToMany(mappedBy = "game", cascade= CascadeType.ALL)
    private List<Player> players;

    @PrePersist
    public void prePersist(){
        this.startTime = Calendar.getInstance();
        players.forEach((player)->{
            player.setGame(this);
        });
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public Long getWinningPlayerId() {
        return winningPlayerId;
    }

    public void setWinningPlayerId(Long winningPlayerId) {
        this.winningPlayerId = winningPlayerId;
    }

    public List<Player> getPlayers(){
        return this.players;
    }

    public void setPlayers(List<Player> players){
        this.players = players;
    }

    public void addPlayer(Player player){
        if(players == null){
            players = new ArrayList<>();
        }

        players.add(player);
    }
}
