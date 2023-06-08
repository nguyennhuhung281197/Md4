package com.example.hom_thu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/option")
public class MyController {

    @GetMapping("")
    public String language(Model model) {
        String[] options = {"English","Vietnamese","Japanese","Chinese"};
        Integer[] sizeOptions = {5, 10, 15, 25, 50, 100};
        model.addAttribute("sizeOptions", sizeOptions);
        model.addAttribute("options", options);
        return "/index";
    }


    @PostMapping ("/result")
    public String create(@RequestParam("a") String name1 , @RequestParam("b") String name2, @RequestParam("c") String name3 , @RequestParam("signature") String name4 , Model model) {
        model.addAttribute("options", name1);
        model.addAttribute("options1", name2);
        model.addAttribute("options2", name3);
        model.addAttribute("options3", name4);
        return "/result";
    }
//
//    @GetMapping("/save")
//    public String save(@RequestParam("run") String name, Model model, Option option) {
//        model.addAttribute("options", name);
//        optionService.save(option);
//        return "/index";
//    }
}