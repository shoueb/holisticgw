package com.bootdo.pc.web;
import com.bootdo.pc.commcontroller.CourseCommController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by huyuangui on 2018/8/11.
 */
@Controller
@RequestMapping("/pc")
public class CourseController extends CourseCommController {

    @RequestMapping("course")
    @Override
    public String index(){
        super.index();
        return "pc/web/course";
    }
}

