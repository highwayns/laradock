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
@Table(name = "staff")
public class Staff {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    public Integer staffId;

    /** */
    @Column(name = "first_name")
    public String firstName;

    /** */
    @Column(name = "last_name")
    public String lastName;

    /** */
    @Column(name = "address_id")
    public Short addressId;

    /** */
    @Column(name = "email")
    public String email;

    /** */
    @Column(name = "store_id")
    public Short storeId;

    /** */
    @Column(name = "active")
    public Boolean active;

    /** */
    @Column(name = "username")
    public String username;

    /** */
    @Column(name = "password")
    public String password;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;

    /** */
    @Column(name = "picture")
    public byte[] picture;
}