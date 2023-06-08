package com.example.ung_dung_bog.controller;

import com.example.ung_dung_bog.model.Bog;
import com.example.ung_dung_bog.service.IBogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BogController {

    @Autowired
    private IBogService bogService;

    @GetMapping("/bog")
    public ModelAndView listBog() {
        List<Bog> bogList = bogService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("bogs", bogList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("bogs", new Bog());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(Bog bog) {
        ModelAndView modelAndView = new ModelAndView("/create");
        bogService.save(bog);
        modelAndView.addObject("bogs", new Bog());
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Long id) {
        Bog bog = bogService.findById(id);
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("bogs", bog);
            return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("bogs") Bog bog) {
        bogService.save(bog);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("bogs", bog);
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView view(@PathVariable Long id){
      Bog bog =  bogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("view" , bog);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable Long id){
       Bog bog = bogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("bogs", bog);
        return modelAndView;
    }

    @PostMapping("/remove")
    public ModelAndView remove(@ModelAttribute("bogs") Bog bog){
        bogService.remove(bog.getId());
        ModelAndView modelAndView = new ModelAndView("redirect:bog");
       return modelAndView;

    }
}
