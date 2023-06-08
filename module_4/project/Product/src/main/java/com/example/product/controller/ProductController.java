package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.IProductService;
import com.example.product.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final IProductService productService = new ProductService();

    @GetMapping("")
    public String index(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("products", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String showCreate(Product product) {
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model) {
        model.addAttribute("products", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirect) {
        productService.update(product.getId(), product);
        redirect.addFlashAttribute("resultEdit", "sửa thành công");
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String showDelete(@PathVariable int id, Model model) {
        model.addAttribute("products", productService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.delete(product.getId());
        redirect.addFlashAttribute("resultDelete", "Xóa Thành Công");
        return "redirect:/product";
    }

    @GetMapping("{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("products", productService.findById(id));
        return "/view";

    }

//    @GetMapping("/products")
//    public String getAllProducts(Model model) {
//        List<Product> products = productService.findAll();
//        model.addAttribute("products", products);
//        return "/index";
//    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model){
        model.addAttribute("products", productService.search(name));
        return "/result";
    }
}
