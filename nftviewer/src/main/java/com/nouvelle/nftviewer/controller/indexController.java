package com.nouvelle.nftviewer.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/")
public class indexController {
    public String index(){

        return "index";
    }
}
