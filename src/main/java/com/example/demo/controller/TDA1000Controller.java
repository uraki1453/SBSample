package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.mapper.PrefectureMapper;


@Controller
public class TDA1000Controller {
    private static final Logger logger = LoggerFactory.getLogger(TDA1000Controller.class);

    @Autowired
    private PrefectureMapper mapper;

    @RequestMapping({ "/TDA1000" })
    public ModelAndView index(ModelAndView mov) {


        List<Map<String, Object>> prefectures =  mapper.selectAll();

        logger.info(prefectures.toString());

        mov.addObject("prefectures", prefectures);
        mov.setViewName("TDA1000");

        return mov;
    }
}