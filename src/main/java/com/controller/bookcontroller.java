package com.controller;

import com.pojo.books;
import com.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class bookcontroller {
    @Autowired
    private bookservice bookservice;

    @RequestMapping("/allbook")
    public String list(Model model) {
        List<books> queryall = bookservice.queryall();
        model.addAttribute("all", queryall);
        return "list";

    }

    @RequestMapping("/add")
    public String add() {
        return "addbook";

    }

    @PostMapping("/addbook")
    public String addbook(books books) {
        bookservice.add(books);
        return "redirect:/allbook";
    }

    @RequestMapping("/update/{id}")
    public String updatebook(@PathVariable("id") Integer id, Model model) {
        books query = bookservice.query(id);
        model.addAttribute("book", query);
        return "updatebook";
    }

    @RequestMapping("/up")
    public String up(books books) {
        System.out.println(books);
        bookservice.updatebook(books);
        return "redirect:/allbook";
    }

    @RequestMapping("/delete/{id}")
    public String up(@PathVariable("id") Integer id) {
        bookservice.deletebyid(id);
        return "redirect:/allbook";
    }
    @RequestMapping("/sousuo")
    public String sousuo(String name,Model model){
        books querybook = bookservice.querybook(name);
        System.out.println(querybook);
        List<books> queryall = new ArrayList<>();
        queryall.add(querybook);
        model.addAttribute("all", queryall);
        return "list";
    }
}