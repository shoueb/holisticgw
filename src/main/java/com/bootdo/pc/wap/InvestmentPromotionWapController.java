package com.bootdo.pc.wap;

import com.bootdo.pc.commcontroller.InvestmentCommController;
import com.bootdo.pc.domain.PageDO;
import com.bootdo.pc.service.GwService;
import com.bootdo.pc.service.PageService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 * Created by huyuangui on 2018/8/11.
 */
@Controller
@RequestMapping("/wap")
public class InvestmentPromotionWapController extends InvestmentCommController {
    @Autowired
    private GwService gwService;
    @Autowired
    private PageService pageService;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("investmentPromotion")
    @Override
    public String index(){
        super.index();
        PageDO pageDO= pageService.getByPageType("about");
//        request.setAttribute("page",pageDO);
        Map<String, Object> params =new HashedMap();
        params.put("pcPageId",pageDO.getId());
        params.put("gwType","首席顾问");
        params.put("gwStatus","1");
        params.put("offset",0);
        params.put("limit",1);
        List teamTop= gwService.list(params);
        request.setAttribute("teamTop",teamTop.get(0));

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
        return "pc/wap/investmentPromotion";
    }

}

