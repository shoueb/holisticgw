package com.bootdo.pc.wap;

import com.bootdo.pc.commcontroller.NewsCommController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by huyuangui on 2018/8/11.
 */
@Controller
@RequestMapping("/wap")
public class NewsWapController extends NewsCommController {

    @RequestMapping("news")
    @Override
    public String index(Model model){
        super.index(model);
        return "pc/wap/news";
    }
}

