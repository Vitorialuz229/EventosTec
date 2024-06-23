package com.github.vitorialuz229.eventostec.repositories;

import com.github.vitorialuz229.eventostec.domin.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
