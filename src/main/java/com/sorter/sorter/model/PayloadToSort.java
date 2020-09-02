package com.sorter.sorter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class PayloadToSort {

    @JsonProperty("sortkeys")
    private String[] sortKeys;
    @JsonProperty("payload")
    private Map<String, Object[]> payload;

    public PayloadToSort() {
    }

    public PayloadToSort(String[] sortKeys, Map<String, Object[]> payload) {
        this.sortKeys = sortKeys;
        this.payload = payload;
    }

    public String[] getSortKeys() {
        return sortKeys;
    }

    public void setSortKeys(String[] sortKeys) {
        this.sortKeys = sortKeys;
    }

    public Map<String, Object[]> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, Object[]> payload) {
        this.payload = payload;
    }
}
