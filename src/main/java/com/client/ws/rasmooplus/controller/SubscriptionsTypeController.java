package com.client.ws.rasmooplus.controller;

import com.client.ws.rasmooplus.exception.NotFoudException;
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

    @GetMapping()
    public ResponseEntity<List<SubscriptionsType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscritionsTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionsType> findById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(subscritionsTypeService.findById(id));
    }

    @ExceptionHandler(NotFoudException.class)
    public ResponseEntity<String> notFoundException(NotFoudException n) {
        String errorMassage = n.getMessage();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMassage);
    }

}
