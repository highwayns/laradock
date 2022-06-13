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
@Table(name = "address")
public class Address {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    public Integer addressId;

    /** */
    @Column(name = "address")
    public String address;

    /** */
    @Column(name = "address2")
    public String address2;

    /** */
    @Column(name = "district")
    public String district;

    /** */
    @Column(name = "city_id")
    public Short cityId;

    /** */
    @Column(name = "postal_code")
    public String postalCode;

    /** */
    @Column(name = "phone")
    public String phone;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;
}