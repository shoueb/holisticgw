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
 * 关于我们
 * Created by huyuangui on 2018/8/11.
 */
@Component
public class AbouteMeCommController {
    @Autowired
    private GwService gwService;
    @Autowired
    private PageService pageService;
    @Autowired
    private HttpServletRequest request;
    public String index(){
        KeysDO keysDO= gwService.getKeysById(1);
        request.setAttribute("keysDO",keysDO);
        request.setAttribute("aboutme","on");
        PageDO pageDO= pageService.getByPageType("about");
        request.setAttribute("page",pageDO);
        //获取教育愿景
        Map<String, Object> params=new HashedMap();
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","教育愿景");
        params.put("gwStatus","1");
        params.put("sort","gw_sort");
        params.put("order","ASC");
        params.put("offset",0);
        params.put("limit",1);
        List list= gwService.list(params);
        request.setAttribute("edu",list!=null?list.get(0):null);

        //品牌简介
        params.clear();
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","品牌简介");
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",2);
        params.put("sort","gw_sort");
        List  introList= gwService.list(params);
        request.setAttribute("introList",introList);


        //品牌历程标题
        params.clear();
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","品牌历程");
        params.put("gwStatus","1");
        params.put("sort","gw_sort");
        params.put("order","ASC");
        List  courseList= gwService.list(params);
        request.setAttribute("courseList",courseList);

        //顾问t
        params.clear();
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","首席顾问");
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",1);
        List  teamTop= gwService.list(params);
        request.setAttribute("teamTop",teamTop.get(0));

        //首席顾问t
        /*Map<String, Object> prams5 =new HashedMap();
        prams5.put("pcPageId",pageDO.getId());
        prams5.put("gwType","首席顾问");
        prams5.put("gwStatus","1");
        prams5.put("offset",0);
        prams5.put("limit",1);
        List  teamFirst= gwService.list(prams5);
        request.setAttribute("teamFirst",teamFirst.get(0));*/


        //顾问列表
        Map<String, Object> prams6 =new HashedMap();
        prams6.put("pcPageId",pageDO.getId());
        prams6.put("gwType","顾问");
        prams6.put("sort","gw_sort");
        prams6.put("order","ASC");
        prams6.put("gwStatus","1");
        prams6.put("offset",0);
        prams6.put("limit",4);
        List  teamList= gwService.list(prams6);
        request.setAttribute("teamList",teamList);
        //品牌荣誉
       /* Map<String, Object> prams7 =new HashedMap();
        prams7.put("pcPageId",pageDO.getId());
        prams7.put("gwType","品牌荣誉");
        prams7.put("gwStatus","1");
        prams7.put("offset",0);
        prams7.put("limit",1);
        List  honoTitle= gwService.list(prams7);
        request.setAttribute("honoTitle",honoTitle.get(0));*/

        //品牌列表
        Map<String, Object> prams8 =new HashedMap();
        prams8.put("pcPageId",pageDO.getId());
        prams8.put("gwType","品牌荣誉");
        prams8.put("gwStatus","1");
        prams8.put("offset",0);
        prams8.put("limit",8);
        prams8.put("sort","gw_sort");
        prams8.put("order","ASC");
        List  honoList= gwService.list(prams8);
        request.setAttribute("honoList",honoList);


        return "pc/web/aboutme";
    }
}

