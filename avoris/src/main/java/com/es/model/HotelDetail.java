package com.es.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Repository;

@Repository
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelDetail {

    private String searchId;

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }
}
