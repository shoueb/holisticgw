package com.bootdo.pc.web;

import com.bootdo.pc.commcontroller.DetailsCommController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by huyuangui on 2018/8/11.
 */
@Controller
@RequestMapping("/pc")
public class DetailsController extends DetailsCommController {
    @RequestMapping("details")
    @Override
    public String index(){
        super.index();
        return "pc/web/details";
    }

}

