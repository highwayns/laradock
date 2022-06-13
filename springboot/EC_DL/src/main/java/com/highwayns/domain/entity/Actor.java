package com.highwayns.domain.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * @author k_kawasaki
 */
@Entity
@Table(name = "actor")
public class Actor {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    public Integer actorId;

    /** */
    @Column(name = "first_name")
    public String firstName;

    /** */
    @Column(name = "last_name")
    public String lastName;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;
}