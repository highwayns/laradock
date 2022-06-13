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
@Table(name = "country")
public class Country {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    public Integer countryId;

    /** */
    @Column(name = "country")
    public String country;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;
}