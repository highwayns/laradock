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
@Table(name = "inventory")
public class Inventory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    public Integer inventoryId;

    /** */
    @Column(name = "film_id")
    public Short filmId;

    /** */
    @Column(name = "store_id")
    public Short storeId;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;
}