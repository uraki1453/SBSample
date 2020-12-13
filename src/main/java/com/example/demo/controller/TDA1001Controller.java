package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.mapper.StaffMapper;
import com.example.demo.model.Staff;

@Controller
@RequestMapping("TDA1001")
public class TDA1001Controller {
    private static final Logger logger = LoggerFactory.getLogger(TDA1001Controller.class);

    @Autowired
    private StaffMapper mapper;

    @GetMapping
    public ModelAndView index(ModelAndView mv) {
        List<Staff> staffs = mapper.selectAll();
        mv.addObject("staffs", staffs);
        mv.setViewName("TDA1001");
        return mv;
    }
}
