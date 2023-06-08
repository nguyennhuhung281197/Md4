package com.example.mini_test_t1_md4.controller;
import com.example.mini_test_t1_md4.model.Posts;
import com.example.mini_test_t1_md4.service.IPosts;
import com.example.mini_test_t1_md4.service.PostsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostsController {
 private final IPosts postsService = new PostsService();

 @GetMapping("/")
    public String list(Model model){
  List<Posts> postsList = postsService.findAll();
     model.addAttribute("posts",postsList);
     return "/index";
 }



}