package com.highwayns.domain.entity;

import java.math.BigDecimal;
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
@Table(name = "film")
public class Film {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    public Integer filmId;

    /** */
    @Column(name = "title")
    public String title;

    /** */
    @Column(name = "description")
    public String description;

    /** */
    @Column(name = "release_year")
    public String releaseYear;

    /** */
    @Column(name = "language_id")
    public Short languageId;

    /** */
    @Column(name = "rental_duration")
    public Short rentalDuration;

    /** */
    @Column(name = "rental_rate")
    public BigDecimal rentalRate;

    /** */
    @Column(name = "length")
    public Short length;

    /** */
    @Column(name = "replacement_cost")
    public BigDecimal replacementCost;

    /** */
    @Column(name = "rating")
    public String rating;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;

    /** */
    @Column(name = "special_features")
    public String specialFeatures;

    /** */
    @Column(name = "fulltext")
    public String fulltext;
}