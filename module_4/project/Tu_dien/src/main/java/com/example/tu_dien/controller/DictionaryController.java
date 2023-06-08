package com.example.tu_dien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/search")
    public String search(@RequestParam("word") String word, Model model) {
        String meaning = searchMeaning(word);
        if (meaning != null) {
            model.addAttribute("result", "Meaning of " + word + ": " + meaning);
        } else {
            model.addAttribute("result", "Word not found: " + word);
        }
        return "index";
    }

    private String searchMeaning(String word) {
        // Tra cứu từ điển và trả về nghĩa của từ
        // Thay thế phần này bằng logic tra cứu từ điển của bạn
        if ("hello".equalsIgnoreCase(word)) {
            return "Xin chào";
        } else if ("world".equalsIgnoreCase(word)) {
            return "Thế giới";
        } else if ("spring".equalsIgnoreCase(word)) {
            return "Mùa xuân";
        } else if ("mvc".equalsIgnoreCase(word)) {
            return "Mô hình MVC";
        } else {
            return null;
        }
    }
}