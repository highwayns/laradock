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
@Table(name = "payment")
public class Payment {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    public Integer paymentId;

    /** */
    @Column(name = "customer_id")
    public Short customerId;

    /** */
    @Column(name = "staff_id")
    public Short staffId;

    /** */
    @Column(name = "rental_id")
    public Integer rentalId;

    /** */
    @Column(name = "amount")
    public BigDecimal amount;

    /** */
    @Column(name = "payment_date")
    public LocalDateTime paymentDate;
}