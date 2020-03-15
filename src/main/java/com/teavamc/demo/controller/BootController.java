package com.teavamc.demo.controller;


import com.teavamc.demo.domain.dto.TestDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "boot")
@Api(value = "Boot控制器")
public class BootController {


    @ApiModelProperty(value = "测试接口")
    @PostMapping(value = "/test")
    public TestDTO getTest(){
        TestDTO testDTO = new TestDTO();
        testDTO.setName("tea");
        testDTO.setCode("1221");
        testDTO.setId(1L);
        return new TestDTO();
    }



}
