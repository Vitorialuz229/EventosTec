package com.github.vitorialuz229.eventostec.repositories;

import com.github.vitorialuz229.eventostec.domin.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {

}
