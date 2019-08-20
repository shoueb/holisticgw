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
public class InvestmentCommController {
    @Autowired
    private GwService gwService;
    @Autowired
    private PageService pageService;
    @Autowired
    private HttpServletRequest request;
    public String index(){
        KeysDO keysDO= gwService.getKeysById(1);
        request.setAttribute("keysDO",keysDO);
        request.setAttribute("investment","on");
        //获取投资合作
        PageDO pageDO5= pageService.getByPageType("investment");
        request.setAttribute("page",pageDO5);
        //投资合作
        Map<String, Object> prams =new HashedMap();
        prams.put("pcPageId",pageDO5.getId());
        prams.put("gwType","投资合作");
        prams.put("gwTitle","投资合作");
        prams.put("gwStatus","1");
        prams.put("offset",0);
        prams.put("limit",1);
        List  inveTitle= gwService.list(prams);
        request.setAttribute("inveTitle",inveTitle.get(0));

        //教育理念
        Map<String, Object> prams1 =new HashedMap();
        prams1.put("pcPageId",pageDO5.getId());
        prams1.put("gwType","教育理念");
        prams1.put("gwStatus","1");
        prams1.put("offset",0);
        prams1.put("limit",1);
        List  inveList1= gwService.list(prams1);
        request.setAttribute("inveList1",inveList1.get(0));

        //我们的服务
        Map<String, Object> prams2 =new HashedMap();
        prams2.put("pcPageId",pageDO5.getId());
        prams2.put("gwType","我们的服务");
        prams2.put("gwStatus","1");
        prams2.put("offset",0);
        prams2.put("limit",1);
        List  inveTitle1= gwService.list(prams2);
        request.setAttribute("inveTitle1",inveTitle1.get(0));

        //我们的服务l1
        Map<String, Object> prams3 =new HashedMap();
        prams3.put("pcPageId",pageDO5.getId());
        prams3.put("gwType","我们的服务1");
        prams3.put("gwStatus","1");
        prams3.put("offset",0);
        prams3.put("limit",3);
        List  inveList2= gwService.list(prams3);
        request.setAttribute("inveList2",inveList2);

        //我们的服务l2
        Map<String, Object> prams4 =new HashedMap();
        prams4.put("pcPageId",pageDO5.getId());
        prams4.put("gwType","我们的服务2");
        prams4.put("gwStatus","1");
        prams4.put("offset",0);
        prams4.put("limit",3);
        List  inveList3= gwService.list(prams4);
        request.setAttribute("inveList3",inveList3);

        Map<String, Object> prams5 =new HashedMap();
        prams5.put("pcPageId",pageDO5.getId());
        prams5.put("gwType","经营扶持");
        prams5.put("gwStatus","1");
        prams5.put("offset",0);
        prams5.put("limit",1);
        List  inveTitle2= gwService.list(prams5);
        request.setAttribute("inveTitle2",inveTitle2.get(0));
        //我们的服务l3
        Map<String, Object> prams6 =new HashedMap();
        prams6.put("pcPageId",pageDO5.getId());
        prams6.put("gwType","经营扶持项");
        prams6.put("gwStatus","1");
        prams1.put("sort","gw_sort");
        prams1.put("order","ASC");
        prams6.put("offset",0);
        prams6.put("limit",9);
        List  inveList4= gwService.list(prams6);
        request.setAttribute("inveList4",inveList4);


        Map<String, Object> prams7 =new HashedMap();
        prams7.put("pcPageId",pageDO5.getId());
        prams7.put("gwType","我们的优势");
        prams7.put("gwStatus","1");
        prams7.put("offset",0);
        prams7.put("limit",1);
        List  inveTitle3= gwService.list(prams7);
        request.setAttribute("inveTitle3",inveTitle3.get(0));

        //国际品牌
        Map<String, Object> prams8 =new HashedMap();
        prams8.put("pcPageId",pageDO5.getId());
        prams8.put("gwType","国际品牌");
        prams8.put("gwStatus","1");
        prams8.put("offset",0);
        prams8.put("limit",1);
        List  inveTitle4= gwService.list(prams8);
        request.setAttribute("inveTitle4",inveTitle4.get(0));

        //教室环境
        Map<String, Object> prams9 =new HashedMap();
        prams9.put("pcPageId",pageDO5.getId());
        prams9.put("gwType","教室环境");
        prams9.put("gwStatus","1");
        prams9.put("offset",0);
        prams9.put("limit",1);
        List  inveTitle5= gwService.list(prams9);
        request.setAttribute("inveTitle5",inveTitle5.get(0));

        Map<String, Object> prams10 =new HashedMap();
        prams10.put("pcPageId",pageDO5.getId());
        prams10.put("gwType","教学乐器");
        prams10.put("gwStatus","1");
        prams10.put("offset",0);
        prams10.put("limit",1);
        List  inveTitle6= gwService.list(prams10);
        request.setAttribute("inveTitle6",inveTitle6.get(0));

        Map<String, Object> prams11 =new HashedMap();
        prams11.put("pcPageId",pageDO5.getId());
        prams11.put("gwType","教学生态");
        prams11.put("gwStatus","1");
        prams11.put("offset",0);
        prams11.put("limit",1);
        List  inveTitle7= gwService.list(prams11);
        request.setAttribute("inveTitle7",inveTitle7.get(0));


        Map<String, Object> prams12 =new HashedMap();
        prams12.put("pcPageId",pageDO5.getId());
        prams12.put("gwType","教学生态list");
        prams12.put("gwStatus","1");
        prams12.put("offset",0);
        prams12.put("limit",6);
        List  inveList5= gwService.list(prams12);
        request.setAttribute("inveList5",inveList5);

        Map<String, Object> prams13 =new HashedMap();
        prams13.put("pcPageId",pageDO5.getId());
        prams13.put("gwType","学习周期");
        prams13.put("gwStatus","1");
        prams13.put("offset",0);
        prams13.put("limit",1);
        List  inveTitle8= gwService.list(prams13);
        request.setAttribute("inveTitle8",inveTitle8.get(0));

        Map<String, Object> prams14 =new HashedMap();
        prams14.put("pcPageId",pageDO5.getId());
        prams14.put("gwType","口碑见证");
        prams14.put("gwStatus","1");
        prams14.put("offset",0);
        prams14.put("limit",1);
        List  inveTitle9= gwService.list(prams14);
        request.setAttribute("inveTitle9",inveTitle9.get(0));

        Map<String, Object> prams15 =new HashedMap();
        prams15.put("pcPageId",pageDO5.getId());
        prams15.put("gwType","口碑见证list");
        prams15.put("gwStatus","1");
        prams15.put("offset",0);
        prams15.put("limit",3);
        List  inveList6= gwService.list(prams15);
        request.setAttribute("inveList6",inveList6);

        Map<String, Object> prams16 =new HashedMap();
        prams16.put("pcPageId",pageDO5.getId());
        prams16.put("gwType","投资要求");
        prams16.put("gwStatus","1");
        prams16.put("offset",0);
        prams16.put("limit",1);
        List  inveTitle10= gwService.list(prams16);
        request.setAttribute("inveTitle10",inveTitle10.get(0));

        return "pc/wab/investment";

    }
}

