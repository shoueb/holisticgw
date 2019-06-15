package com.bootdo.pc.commcontroller;

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
public class TaiWanCommController {
    @Autowired
    private GwService gwService;
    @Autowired
    private PageService pageService;
    @Autowired
    private HttpServletRequest request;
    public String index(){
        request.setAttribute("taiwan","on");
        PageDO pageDO6= pageService.getByPageType("taiwan");
        request.setAttribute("page",pageDO6);
        //标题
        Map<String, Object> prams =new HashedMap();
        prams.put("pcPageId",pageDO6.getId());
        prams.put("gwType","台湾梅苓");
        prams.put("gwStatus","1");
        prams.put("offset",0);
        prams.put("limit",1);
        List  taiwanTitle= gwService.list(prams);
        request.setAttribute("taiwanTitle",taiwanTitle.get(0));

        //列表
        Map<String, Object> prams1 =new HashedMap();
        prams1.put("pcPageId",pageDO6.getId());
        prams1.put("gwType","木琴大赛");
        prams1.put("gwStatus","1");
        prams1.put("offset",0);
        prams1.put("limit",1);
        List  taiwanList1= gwService.list(prams1);
        request.setAttribute("taiwanList1",taiwanList1.get(0));

        //列表
        Map<String, Object> prams2 =new HashedMap();
        prams2.put("pcPageId",pageDO6.getId());
        prams2.put("gwType","击乐嘉年华");
        prams2.put("gwStatus","1");
        prams2.put("offset",0);
        prams2.put("limit",1);
        List  taiwanList2= gwService.list(prams2);
        request.setAttribute("taiwanList2",taiwanList2.get(0));


        //标题
        Map<String, Object> prams3 =new HashedMap();
        prams3.put("pcPageId",pageDO6.getId());
        prams3.put("gwType","专家赠言");
        prams3.put("gwStatus","1");
        prams3.put("offset",0);
        prams3.put("limit",1);
        List  taiwanTitle1= gwService.list(prams3);
        request.setAttribute("taiwanTitle1",taiwanTitle1.get(0));


        //列表
        Map<String, Object> prams4 =new HashedMap();
        prams4.put("pcPageId",pageDO6.getId());
        prams4.put("gwType","专家赠言列表");
        prams4.put("gwStatus","1");
        prams4.put("offset",0);
        prams4.put("limit",4);
        List  taiwanList3= gwService.list(prams4);
        request.setAttribute("taiwanList3",taiwanList3);

        return "pc/web/taiwan";
    }
}

