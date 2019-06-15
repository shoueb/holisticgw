package com.bootdo.pc.wap;

import com.bootdo.pc.commcontroller.HomePageCommController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/wap")
public class HomePageWapController extends HomePageCommController {
    @Override
    @RequestMapping("/index")
    public String index(){
        super.index();
        return "pc/wap/homePage";
    }
}

