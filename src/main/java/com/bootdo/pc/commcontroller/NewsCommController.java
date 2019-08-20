package com.bootdo.pc.commcontroller;

import com.bootdo.pc.domain.KeysDO;
import com.bootdo.pc.domain.PageDO;
import com.bootdo.pc.service.GwService;
import com.bootdo.pc.service.PageService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by huyuangui on 2018/8/11.
 */
@Component
public class NewsCommController {
    @Autowired
    private GwService gwService;
    @Autowired
    private PageService pageService;
    @Autowired
    private HttpServletRequest request;

    public String index(Model model){
        KeysDO keysDO= gwService.getKeysById(1);
        request.setAttribute("keysDO",keysDO);
        request.setAttribute("news","on");
        String gwType=request.getParameter("gwType");
        int pageNum=request.getParameter("pageNum")!=null?Integer.valueOf(request.getParameter("pageNum")):1;
        int totalRecord=0;
        PageDO pageDO4= pageService.getByPageType("news");
        request.setAttribute("page",pageDO4);

        //导航
        Map<String, Object> params =new HashedMap();
        params.put("pcPageId",pageDO4.getId());
        params.put("gwStatus","1");
        List  newsNavList= gwService.listDistinct(params);
        request.setAttribute("newsNavList",newsNavList);

        //列表
        Map<String, Object> prams4 =new HashedMap();
        prams4.put("pcPageId",pageDO4.getId());
        prams4.put("gwType",gwType);
        prams4.put("gwStatus","1");
        prams4.put("sort","gw_change_start_time");
        prams4.put("order","desc");
        prams4.put("offset",(pageNum-1)*10);
        prams4.put("limit",10);

        List  newsList1= gwService.list(prams4);
        request.setAttribute("newsList1",newsList1);
        totalRecord=gwService.count(prams4);
        int totalPages = (totalRecord  +  10  - 1) / 10;
        //获得当前页
        model.addAttribute("pageNum", pageNum);
        //获得一页显示的条数
        model.addAttribute("pageSize", 10);
        //是否是第一页
        model.addAttribute("isFirstPage", pageNum==1);
        //获得总页数
        model.addAttribute("formPages", (pageNum-4)>0?pageNum-4:((pageNum-3)>0?pageNum-3:((pageNum-2)>0?pageNum-2:1)));
        //获得总页数
        model.addAttribute("toPages", totalPages!=pageNum?totalPages-pageNum>5?pageNum+5:totalPages-pageNum>4?pageNum+4:totalPages-pageNum>3?pageNum+3:totalPages-pageNum>2?pageNum+2:totalPages:totalPages);
        //获得总页数
        model.addAttribute("totalPages", totalPages);
        //是否是最后一页
        model.addAttribute("isLastPage", pageNum==totalPages);

        request.setAttribute("gwType",gwType);
        return "pc/web/news";
    }
}

