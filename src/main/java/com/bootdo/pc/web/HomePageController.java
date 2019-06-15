package com.bootdo.pc.web;

import com.bootdo.pc.commcontroller.HomePageCommController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomePageController extends HomePageCommController {

    @Override
    @RequestMapping("/")
    public String index(){
        super.index();
        return "pc/web/homePage";
    }
}

