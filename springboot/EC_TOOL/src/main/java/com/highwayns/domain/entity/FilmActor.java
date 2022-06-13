package com.highwayns.domain.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * @author k_kawasaki
 */
@Entity
@Table(name = "film_actor")
public class FilmActor {

    /** */
    @Id
    @Column(name = "actor_id")
    public Short actorId;

    /** */
    @Id
    @Column(name = "film_id")
    public Short filmId;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;
}