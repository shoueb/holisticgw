package com.bootdo.pc.web;

import com.bootdo.common.utils.R;
import com.bootdo.common.utils.ShiroUtils;
import com.bootdo.common.utils.StringUtils;
import com.bootdo.pc.domain.AppointmentDO;
import com.bootdo.pc.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

/**
 *预约
 * Created by huyuangui on 2018/8/16.
 */
@Controller
@RequestMapping("/pc")
public class BabyAppiontController {
    @Autowired
    private AppointmentService appointmentService;
    @ResponseBody
    @RequestMapping("appiont")
    public R save(AppointmentDO appointment){
         if(StringUtils.isBlank(appointment.getBabyName())){
             return R.error("请填写宝贝名称");
         }
        if(StringUtils.isBlank(appointment.getTel())){
            return R.error("请填写联系手机");
        }
        if(appointment.getBabyAge()==null || appointment.getBabyAge()<1){
            appointment.setBabyAge(1);
        }
        if(StringUtils.isBlank(appointment.getFromChannel())){
            appointment.setFromChannel("默认");
        }
        appointment.setAppointStatus("0");
        appointment.setCreateby("");
        appointment.setCreatetime(new Date());
        appointment.setUpdateby("");
        appointment.setUpdatetime(new Date());
        if(appointmentService.save(appointment)>0){
            return R.ok();
        }
        return R.error();
    }
}
