package com.client.ws.rasmooplus.controller;

import com.client.ws.rasmooplus.dto.SubscriptionsTypeDto;
import com.client.ws.rasmooplus.model.SubscriptionsType;
import com.client.ws.rasmooplus.service.SubscritionsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscriptions-type")
public class SubscriptionsTypeController {

    @Autowired
    private SubscritionsTypeService subscritionsTypeService;

    @GetMapping
    public ResponseEntity<List<SubscriptionsType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscritionsTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionsType> findById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(subscritionsTypeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<SubscriptionsType> create(@RequestBody SubscriptionsTypeDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(subscritionsTypeService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubscriptionsType> update(@PathVariable("id") Long id, @RequestBody SubscriptionsTypeDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(subscritionsTypeService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        subscritionsTypeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

}
