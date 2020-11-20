package com.damian229.praytic.questionjsonview.controllers;

import com.damian229.praytic.questionjsonview.dtos.DTO;
import com.damian229.praytic.questionjsonview.views.View;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.SneakyThrows;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class restDummyController {

    @JsonView(View.MyView.class)
    @SneakyThrows
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DTO> get(@PathVariable Integer id) {
        final DTO dummyDTO = new DTO();
        dummyDTO.setId(id);
        dummyDTO.setName(RandomStringUtils.randomAlphanumeric(5));
        return List.of(dummyDTO);
    }

    @SneakyThrows
    @GetMapping(path = "all/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DTO> getAll(@PathVariable Integer id) {
        final DTO dummyDTO = new DTO();
        dummyDTO.setId(id);
        dummyDTO.setName(RandomStringUtils.randomAlphanumeric(5));
        return List.of(dummyDTO);
    }
}
