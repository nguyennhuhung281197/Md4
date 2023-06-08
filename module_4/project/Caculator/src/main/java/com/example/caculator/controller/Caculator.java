package com.example.caculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Caculator {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ShowForm() {
        return "index";
    }

    @RequestMapping(value = "/cucalator", method = RequestMethod.POST)
    public String calculate(@RequestParam("num1") String number1, @RequestParam("num2") String number2, @RequestParam("run") String run, Model model) {

        if (number1.isEmpty() || number2.isEmpty()) {
            model.addAttribute("index","Please enter a value");
            return "index";
        }
        double result = 0;
        switch (run) {
            case "Addition":
                result = Double.parseDouble(number1) + Double.parseDouble(number2);
                break;
            case "Subtraction":
                result = Double.parseDouble(number1) - Double.parseDouble(number2);
                break;
            case "Multiplication":
                result = Double.parseDouble(number1) * Double.parseDouble(number2);
                break;
            case "Division":
                result = Double.parseDouble(number1) / Double.parseDouble(number2);
                break;
            default:
                break;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
