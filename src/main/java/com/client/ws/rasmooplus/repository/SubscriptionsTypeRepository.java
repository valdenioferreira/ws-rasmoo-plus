package com.client.ws.rasmooplus.repository;

import com.client.ws.rasmooplus.model.SubscriptionsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionsTypeRepository extends JpaRepository<SubscriptionsType,Long> {
}
