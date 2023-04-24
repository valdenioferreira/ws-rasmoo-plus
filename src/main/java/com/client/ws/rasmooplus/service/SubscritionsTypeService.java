package com.client.ws.rasmooplus.service;

import com.client.ws.rasmooplus.dto.SubscriptionsTypeDto;
import com.client.ws.rasmooplus.model.SubscriptionsType;

import java.util.List;

public interface SubscritionsTypeService {

    List<SubscriptionsType> findAll();

    SubscriptionsType findById(Long id);


    SubscriptionsType create(SubscriptionsTypeDto dto);

    SubscriptionsType update(Long id, SubscriptionsTypeDto dto);

    void delete(Long id);
}
