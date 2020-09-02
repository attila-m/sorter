package com.sorter.sorter.controller;

import com.sorter.sorter.model.PayloadToSort;
import com.sorter.sorter.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SortingController {

@Autowired
SortService service;

    @PostMapping(value = "/sort", consumes = "application/json", produces = "application/json")
    Map<String, Object[]> sortPayload(@RequestBody PayloadToSort payloadToSort) {

        service.sortPayload(payloadToSort);

        return payloadToSort.getPayload();
    }

}
