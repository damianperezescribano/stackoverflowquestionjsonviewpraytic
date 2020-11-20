package com.damian229.praytic.questionjsonview.dtos;

import com.damian229.praytic.questionjsonview.views.View;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DTO {

    private Integer id;

    @JsonView(View.MyView.class)
    private String name;
}
