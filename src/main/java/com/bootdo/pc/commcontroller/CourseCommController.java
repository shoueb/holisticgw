package com.bootdo.pc.commcontroller;

import com.bootdo.pc.domain.KeysDO;
import com.bootdo.pc.domain.PageDO;
import com.bootdo.pc.service.GwService;
import com.bootdo.pc.service.PageService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by huyuangui on 2018/8/11.
 */
@Component
public class CourseCommController {
    @Autowired
    private GwService gwService;
    @Autowired
    private PageService pageService;
    @Autowired
    private HttpServletRequest request;

    public String index(){
        KeysDO keysDO= gwService.getKeysById(1);
        request.setAttribute("keysDO",keysDO);
        request.setAttribute("course","on");
        //获取课程体系
        PageDO pageDO= pageService.getByPageType("course");
        request.setAttribute("page",pageDO);

        Map<String, Object> params =new HashedMap();
        //课程体系
        String listNum=this.request.getParameter("listNum");
        params.clear();
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","课程体系");
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",6);
        List  List= gwService.list(params);
        request.setAttribute("List",List);
        request.setAttribute("listNum",listNum);

        //乐器
        params.clear();
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","musical");
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",5);

        List  musicalList= gwService.list(params);
        request.setAttribute("musicalList",musicalList);

        return "pc/web/course";
    }
}

