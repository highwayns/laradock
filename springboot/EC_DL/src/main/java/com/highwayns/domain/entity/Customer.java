package com.highwayns.domain.entity;

import java.time.LocalDate;
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
@Table(name = "customer")
public class Customer {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    public Integer customerId;

    /** */
    @Column(name = "store_id")
    public Short storeId;

    /** */
    @Column(name = "first_name")
    public String firstName;

    /** */
    @Column(name = "last_name")
    public String lastName;

    /** */
    @Column(name = "email")
    public String email;

    /** */
    @Column(name = "address_id")
    public Short addressId;

    /** */
    @Column(name = "activebool")
    public Boolean activebool;

    /** */
    @Column(name = "create_date")
    public LocalDate createDate;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;

    /** */
    @Column(name = "active")
    public Integer active;
}