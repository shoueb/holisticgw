package com.bootdo.pc.commcontroller;

import com.bootdo.pc.domain.KeysDO;
import com.bootdo.pc.domain.PageDO;
import com.bootdo.pc.service.GwService;
import com.bootdo.pc.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huyuangui on 2018/8/11.
 */
@Component
public class AdvantageCommController {
    @Autowired
    private GwService gwService;
    @Autowired
    private PageService pageService;
    @Autowired
    private HttpServletRequest request;

    public String index(){
        KeysDO keysDO= gwService.getKeysById(1);
        request.setAttribute("keysDO",keysDO);
        request.setAttribute("advantage","on");
        //核心优势
        PageDO pageDO2= pageService.getByPageType("advantage");
        request.setAttribute("page",pageDO2);
        //列表
        Map<String, Object> prams3 =new HashMap();
        prams3.put("pcPageId",pageDO2.getId());
        prams3.put("gwType","核心优势");
        prams3.put("gwStatus","1");
        prams3.put("sort","gw_sort");
        prams3.put("order","ASC");
        prams3.put("offset",0);
        prams3.put("limit",6);
        List  list4= gwService.list(prams3);
        request.setAttribute("list4",list4);

        return "pc/web/advantage";
    }
}

