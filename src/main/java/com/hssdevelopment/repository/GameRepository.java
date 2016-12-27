package com.hssdevelopment.repository;

import com.hssdevelopment.domain.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mhensley on 12/27/16.
 */

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
}
