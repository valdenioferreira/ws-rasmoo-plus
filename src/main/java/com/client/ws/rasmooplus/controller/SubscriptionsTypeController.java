package com.client.ws.rasmooplus.controller;

import com.client.ws.rasmooplus.model.SubscriptionsType;
import com.client.ws.rasmooplus.repository.SubscriptionsTypeRepository;
import com.client.ws.rasmooplus.service.SubscritionsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subscriptions-type")
public class SubscriptionsTypeController {

    @Autowired
    private SubscritionsTypeService subscritionsTypeService;
    @GetMapping()
  public ResponseEntity<List<SubscriptionsType>> findAll(){
      return ResponseEntity.status(HttpStatus.OK).body(subscritionsTypeService.findAll());
  }
}
