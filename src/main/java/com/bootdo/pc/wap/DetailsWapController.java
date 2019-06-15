package com.bootdo.pc.wap;

import com.bootdo.pc.commcontroller.DetailsCommController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by huyuangui on 2018/8/11.
 */
@Controller
@RequestMapping("/wap")
public class DetailsWapController extends DetailsCommController {
    @Override
    @RequestMapping("details")
    public String index(){
        super.index();
        return "pc/wap/details";
    }

}

