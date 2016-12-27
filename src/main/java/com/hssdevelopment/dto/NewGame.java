package com.hssdevelopment.dto;

import com.hssdevelopment.domain.Player;

import java.util.List;

/**
 * Created by mhensley on 12/27/16.
 */
public class NewGame {

    private Long id;

    private String token;

    private List<Player> players;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }


    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        NewGame newGame = (NewGame) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(getId(), newGame.getId())
                .append(token, newGame.token)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(getId())
                .append(token)
                .toHashCode();
    }

    public List<Player> getPlayers(){
        return this.players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
