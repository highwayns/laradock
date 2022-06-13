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
@Table(name = "film_category")
public class FilmCategory {

    /** */
    @Id
    @Column(name = "film_id")
    public Short filmId;

    /** */
    @Id
    @Column(name = "category_id")
    public Short categoryId;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;
}