package com.bootdo.pc.commcontroller;

import com.bootdo.pc.domain.GwDO;
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
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huyuangui on 2018/8/11.
 */
@Component
public class DetailsCommController {
    @Autowired
    private GwService gwService;
    @Autowired
    private PageService pageService;
    @Autowired
    private  HttpServletResponse response;
    @Autowired
    private HttpServletRequest request;

    public String index(){
        KeysDO keysDO= gwService.getKeysById(1);
        request.setAttribute("keysDO",keysDO);
        request.setAttribute("news","on");
        String id=this.request.getParameter("id");
        Map params=new HashMap();
        params.put("id",id);
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",1);
        List article= gwService.list(params);
        request.setAttribute("article",article.get(0));
        GwDO gwDO= (GwDO) article.get(0);
        gwDO.setGwCount(gwDO.getGwCount()+1);
        gwService.update(gwDO);
        PageDO pageDO4= pageService.getByPageType("news");
        request.setAttribute("page",pageDO4);



        //列表
        Map<String, Object> prams4 =new HashedMap();
        prams4.put("pcPageId",pageDO4.getId());
        prams4.put("gwStatus","1");
        prams4.put("sort","gw_change_start_time");
        prams4.put("order","desc");
        prams4.put("offset",1);
        prams4.put("limit",10);
        List  newsList1= gwService.list(prams4);
        request.setAttribute("newsList1",newsList1);

        return "pc/web/details";
    }

}

