package com.irontech.testapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21.08.13
 * Time: 1:28
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IronTechTestController {
    @RequestMapping("hello")
    public ModelAndView helloWorld() {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("hello", "Hello Spring!");
        return mav;
    }
}
