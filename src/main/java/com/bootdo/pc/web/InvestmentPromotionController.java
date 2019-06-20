package com.bootdo.pc.web;

import com.bootdo.common.utils.R;
import com.bootdo.common.utils.StringUtils;
import com.bootdo.pc.commcontroller.InvestmentCommController;
import com.bootdo.pc.domain.InvestmentDO;
import com.bootdo.pc.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by huyuangui on 2018/8/11.
 */
@Controller
@RequestMapping("/pc")
public class InvestmentPromotionController extends InvestmentCommController {
    @Autowired
    private InvestmentService investmentService;

    @RequestMapping("investmentPromotion")
    @Override
    public String index(){
        super.index();
        return "pc/web/investmentPromotion";
    }
   /* @RequestMapping("preInvestment")
    public String preInvestment(){
        super.index();
        return "pc/web/preInvestment";
    }
    @ResponseBody
    @RequestMapping("addInvestment")
    public R save(InvestmentDO investmentDO){
        if(StringUtils.isBlank(investmentDO.getName())){
            return R.error("请填写名称或姓氏");
        }
        if(StringUtils.isBlank(investmentDO.getTel())){
            return R.error("请填写联系手机");
        }
        if(StringUtils.isBlank(investmentDO.getCity())){
            return R.error("请填写意向城市");
        }
        investmentDO.setStatus("0");
        investmentDO.setAddtime(new Date());
        if(investmentService.save(investmentDO)>0){
            return R.ok();
        }
        return R.error();
    }*/
}

