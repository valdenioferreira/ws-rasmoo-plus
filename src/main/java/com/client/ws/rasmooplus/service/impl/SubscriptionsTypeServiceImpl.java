package com.client.ws.rasmooplus.service.impl;

import com.client.ws.rasmooplus.model.SubscriptionsType;
import com.client.ws.rasmooplus.repository.SubscriptionsTypeRepository;
import com.client.ws.rasmooplus.service.SubscritionsTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionsTypeServiceImpl implements SubscritionsTypeService {

    private final SubscriptionsTypeRepository subscriptionsTypeRepository;

    public SubscriptionsTypeServiceImpl(SubscriptionsTypeRepository subscriptionsTypeRepository) {
        this.subscriptionsTypeRepository = subscriptionsTypeRepository;
    }

    @Override
    public List<SubscriptionsType> findAll() {
        return subscriptionsTypeRepository.findAll();
    }

    @Override
    public SubscriptionsType findById(Long id) {
        return null;
    }

    @Override
    public SubscriptionsType create(SubscriptionsType subscriptionsType) {
        return null;
    }

    @Override
    public SubscriptionsType update(Long id, SubscriptionsType subscriptionsType) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
