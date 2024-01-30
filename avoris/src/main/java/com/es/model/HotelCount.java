package com.es.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@JsonInclude(JsonInclude.Include.NON_NULL)
//NOSONAR
public class HotelCount {

    private String searchId;

    private Hotel search;

    private Integer count;

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public Hotel getSearch() {
        return search;
    }

    public void setSearch(Hotel search) {
        this.search = search;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
