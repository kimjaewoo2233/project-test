package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {



        @GetMapping("/api/test")
        public String get(){
                return "HHHHHHH";
        }
        @GetMapping("/api/test2")
        public String get2(){
                return "HHHHHHH";
        }
}
