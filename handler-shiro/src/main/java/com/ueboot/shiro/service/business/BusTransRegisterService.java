package com.ueboot.shiro.service.business;

import com.ueboot.shiro.controller.business.vo.BusTransRegisterVo;
import com.ueboot.shiro.core.service.BaseService;
import com.ueboot.shiro.entity.BusinessTransferRegister;

public interface BusTransRegisterService extends BaseService<BusinessTransferRegister> {
    void add(BusTransRegisterVo param);
}
