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
@Table(name = "rental")
public class Rental {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    public Integer rentalId;

    /** */
    @Column(name = "rental_date")
    public LocalDateTime rentalDate;

    /** */
    @Column(name = "inventory_id")
    public Integer inventoryId;

    /** */
    @Column(name = "customer_id")
    public Short customerId;

    /** */
    @Column(name = "return_date")
    public LocalDateTime returnDate;

    /** */
    @Column(name = "staff_id")
    public Short staffId;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;
}