package com.client.ws.rasmooplus.service.impl;

import com.client.ws.rasmooplus.exception.NotFoudException;
import com.client.ws.rasmooplus.model.SubscriptionsType;
import com.client.ws.rasmooplus.repository.SubscriptionsTypeRepository;
import com.client.ws.rasmooplus.service.SubscritionsTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<SubscriptionsType> optionalSubscriptionsType = subscriptionsTypeRepository.findById(id);
        if (optionalSubscriptionsType.isEmpty()) {
            throw new NotFoudException("SubscriptionType não encontrado");
        }
        return optionalSubscriptionsType.get();
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
