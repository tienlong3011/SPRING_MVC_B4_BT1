package com.codegym.controller;

import com.codegym.model.Settings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/setting")
public class SettingController {
    @GetMapping("")
    public ModelAndView create(){
        String [] language = {"English","Vietnamese","Japanese","Chinese"};
        int [] pageSize = {5,10,15,25,50,100};
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("language",language);
        modelAndView.addObject("pageSize",pageSize);
        modelAndView.addObject("settings",new Settings());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView update(@ModelAttribute Settings settings){
        String [] language = {"English","Vietnamese","Japanese","Chinese"};
        int [] pageSize = {5,10,15,25,50,100};
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("language",language);
        modelAndView.addObject("pageSize",pageSize);
        modelAndView.addObject("settings", settings);
        return modelAndView;
    }
}
