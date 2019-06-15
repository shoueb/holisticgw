package com.bootdo.pc.web;

import com.bootdo.pc.commcontroller.AbouteMeCommController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 关于我们
 * Created by huyuangui on 2018/8/11.
 */
@Controller
@RequestMapping("/pc")
public class AbouteMeController extends AbouteMeCommController {
    @RequestMapping("aboutme")
    @Override
    public String index(){
        super.index();
        return "pc/web/aboutme";
    }
}

