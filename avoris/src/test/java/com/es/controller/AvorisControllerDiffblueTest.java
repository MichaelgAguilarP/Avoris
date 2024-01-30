package com.es.controller;

import com.es.helper.AvorisHotelHelper;
import com.es.model.Hotel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.mock;

@ContextConfiguration(classes = {AvorisController.class, Hotel.class})
@ExtendWith(SpringExtension.class)
class AvorisControllerDiffblueTest {
    @Autowired
    private AvorisController avorisController;

    @MockBean
    private AvorisHotelHelper avorisHotelHelper;

    @Autowired
    private Hotel hotel;

    @Test
    void testGetDetailsHotel() throws Exception {
        MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.post("/api/search")
                .contentType(MediaType.APPLICATION_JSON);
        MockHttpServletRequestBuilder requestBuilder = contentTypeResult
                .content((new ObjectMapper()).writeValueAsString(mock(Hotel.class)));
        MockMvcBuilders.standaloneSetup(avorisController).build().perform(requestBuilder);
    }
}
