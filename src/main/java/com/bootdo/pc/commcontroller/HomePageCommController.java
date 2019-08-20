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
 * Created by hyb on 2018/8/11.
 */
@Component
public class HomePageCommController {
    @Autowired
    private GwService gwService;
    @Autowired
    private PageService pageService;
    @Autowired
    private HttpServletRequest request;

    public String index(){
        KeysDO keysDO= gwService.getKeysById(1);
        request.setAttribute("keysDO",keysDO);

        request.setAttribute("homepage","on");
        //获取首页
        PageDO pageDO= pageService.getByPageType("homepage");
        request.setAttribute("page",pageDO);
        //查询
        Map params=new HashMap();
        //首屏轮播图
        params.clear();
        //查询首页的数据
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","首屏轮播图");
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",3);

        List list0= gwService.list(params);
        request.setAttribute("list0",list0);

       ///首页轮播图
        params.clear();
//        PageDO pageDO4= pageService.getByPageType("news");
//        request.setAttribute("page4",pageDO4);
        //查询首页的数据
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","首页轮播图");
        params.put("gwStatus","1");
        params.put("sort","gw_sort");
        params.put("order","desc");
        params.put("offset",0);
        params.put("limit",5);
        List list1= gwService.list(params);
        request.setAttribute("list1",list1);
        //核心优势标题
        params.clear();
//        PageDO pageDO5= pageService.getByPageType("advantage");
//        request.setAttribute("pageDO5",pageDO5);

        params.clear();
        params.put("pcPageId",pageDO.getId());
        params.put("gwStatus","1");
        params.put("gwType","核心优势");
        params.put("offset",0);
        params.put("limit",1);
        List list2= gwService.list(params);
//        System.out.println(list2.get(0));
        request.setAttribute("list2",list2.get(0));
     /*   if (list2.size()==1){

        }*/



        //核心优势
//        PageDO pageDO2= pageService.getByPageType("advantage");
//        request.setAttribute("page2",pageDO2);
        //核心优势
        params.clear();
        //核心优势
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","核心优势列表");
        params.put("gwStatus","1");
        params.put("sort","gw_serial_num");
        params.put("order","asc");
        params.put("offset",0);
        params.put("limit",6);
        List list3= gwService.list(params);
        request.setAttribute("list3",list3);


        //课程体系标题
        params.clear();
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","课程体系");
        params.put("offset",0);
        params.put("limit",1);
        List list4= gwService.list(params);
        if (list4.size()==1){
            request.setAttribute("list4",list4.get(0));
        }



        //课程体系列表
//        PageDO pageDO3= pageService.getByPageType("course");
//        request.setAttribute("page3",pageDO3);
        //课程体系
        params.clear();
        //课程体系
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","课程体系列表");
        params.put("gwStatus","1");
        params.put("sort","gw_sort");
        params.put("order","asc");
        params.put("offset",0);
        params.put("limit",6);
        List list5= gwService.list(params);
        request.setAttribute("list5",list5);

        //全球选优
        params.clear();
        //全球选优
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","全球优选");
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",1);
        List list6= gwService.list(params);
        if (list6.size()==1) {
            request.setAttribute("list6", list6.get(0));
        }

        //新闻动态
        params.clear();
        //新闻动态
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","新闻动态");
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",1);
        List list7= gwService.list(params);
        if (list7.size()==1) {
            request.setAttribute("list7", list7.get(0));
        }

        //新闻列表
        params.clear();
        PageDO pageDO4= pageService.getByPageType("news");
        //新闻列表
        params.put("pcPageId",pageDO4.getId());
        params.put("gwStatus","1");
        params.put("sort","gw_change_start_time");
        params.put("order","desc");
        params.put("offset",0);
        params.put("limit",8);
        List listNews= gwService.list(params);
        request.setAttribute("listNews",listNews);

        //服务承诺
        params.clear();
        //服务承诺
        params.put("pcPageId",pageDO.getId());
//        params.put("gwHomePageShow","1");
        params.put("gwStatus","1");
        params.put("gwType","服务承诺");
        params.put("offset",0);
        params.put("limit",3);
        List list8= gwService.list(params);
        request.setAttribute("list8",list8);


        //教育愿景
        params.clear();
        //教育愿景
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","教育愿景");
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",1);
        List list9= gwService.list(params);
        if (list9.size()==1){
            request.setAttribute("list9",list9.get(0));
        }

        //事业范围
        params.clear();
        //事业范围
        params.put("pcPageId",pageDO.getId());
        params.put("gwHomePageShow","1");
        params.put("gwStatus","1");
        params.put("gwType","事业范围");
        params.put("offset",0);
        params.put("limit",4);
        List list10= gwService.list(params);
        request.setAttribute("list10",list10);

        return "pc/web/homePage";
    }
}

