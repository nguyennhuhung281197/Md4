package com.example.display_sandwich.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Sandwich {
    @GetMapping ("/")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
   @PostMapping ("/save")
    public ModelAndView save(@RequestParam("condiment") String condiment) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",condiment);
        modelAndView.setViewName("result");
            return modelAndView;

    }
}
