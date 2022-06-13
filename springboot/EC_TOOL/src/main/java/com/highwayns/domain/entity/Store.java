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
@Table(name = "store")
public class Store {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    public Integer storeId;

    /** */
    @Column(name = "manager_staff_id")
    public Short managerStaffId;

    /** */
    @Column(name = "address_id")
    public Short addressId;

    /** */
    @Column(name = "last_update")
    public LocalDateTime lastUpdate;
}