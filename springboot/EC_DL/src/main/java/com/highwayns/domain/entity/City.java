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
@Table(name = "city")
public class City {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    public Integer cityId;

    /** */
    @Column(name = "city")
    public String city;

    /** */
    @Column(name = "country_id")
    public Short countryId;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;
}