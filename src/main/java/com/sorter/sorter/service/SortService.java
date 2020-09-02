package com.sorter.sorter.service;

import com.sorter.sorter.model.PayloadToSort;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SortService {

    public void sortPayload(PayloadToSort payloadToSort) throws IllegalArgumentException {

        if (payloadToSort == null || payloadToSort.getPayload() == null) {
            throw new IllegalArgumentException();
        }

        for (String sortKey : payloadToSort.getSortKeys()) {
            Arrays.sort(payloadToSort.getPayload().get(sortKey));
        }

    }

}
