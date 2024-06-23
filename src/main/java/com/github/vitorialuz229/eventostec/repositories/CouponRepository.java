package com.github.vitorialuz229.eventostec.repositories;

import com.github.vitorialuz229.eventostec.domin.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
