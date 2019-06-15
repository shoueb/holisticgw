package com.bootdo.baidu;

import com.bootdo.common.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by huyuangui on 2018/9/7.
 */
@Controller
public class UeditorController {
    @RequestMapping("/js/plugins/ueditor/config")
    public String config(HttpServletRequest request,HttpServletResponse response) {
        return "redirect:/js/plugins/ueditor/config/config.json";
    }
    @RequestMapping(value = "/ueditor")
    @ResponseBody
    public String ueditor(HttpServletRequest request, HttpServletResponse response) {

        String s = "{\n"+
                "            \"imageActionName\": \"uploadimage\",\n" +
                "                \"imageFieldName\": \"file\", \n" +
                "                \"imageMaxSize\": 2048000, \n" +
                "                \"imageAllowFiles\": [\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\"], \n" +
                "                \"imageCompressEnable\": true, \n" +
                "                \"imageCompressBorder\": 1600, \n" +
                "                \"imageInsertAlign\": \"none\", \n" +
                "                \"imageUrlPrefix\": \"\",\n" +
                "                \"imagePathFormat\": \"/ueditor/jsp/upload/image/{yyyy}{mm}{dd}/{time}{rand:6}\" }";
        return s;

    }
}
