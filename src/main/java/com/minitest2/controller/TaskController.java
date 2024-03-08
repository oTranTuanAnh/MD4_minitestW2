package com.minitest2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    @GetMapping("")
    public ModelAndView showTask(){
        ModelAndView modelAndView = new ModelAndView("/taskview/list");
        modelAndView.addObject("task",)
        return modelAndView;
    }

}
