package com.teavamc.demo.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestDTO implements Serializable {


    private String name;
    private String code;
    private Long id;


}
