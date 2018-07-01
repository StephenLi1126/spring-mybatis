package com.stephen.spring.mybatis.controller;

import com.stephen.spring.mybatis.model.User;
import com.stephen.spring.mybatis.service.IUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class Test {
    private final static Logger logger = LoggerFactory.getLogger(Test.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value="/view", method=RequestMethod.GET) 
    public ModelAndView test(){
       ModelAndView mav = new ModelAndView();
       User user = this.userService.getUser(1);
       logger.debug("get user {}",user.getUserName());
       mav.setViewName("view");
       return mav;
     }

}
