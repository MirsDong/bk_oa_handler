package com.ueboot.shiro.service.business.impl;

import com.ueboot.core.repository.BaseRepository;
import com.ueboot.core.service.impl.BaseServiceImpl;
import com.ueboot.shiro.controller.business.vo.BusTransRegisterVo;
import com.ueboot.shiro.entity.BusinessTransferRegister;
import com.ueboot.shiro.service.business.BusTransRegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@ConditionalOnMissingBean(name = "busTransRegisterService")
public class BusTransRegisterServiceImpl extends BaseServiceImpl<BusinessTransferRegister> implements BusTransRegisterService {


    @Override
    protected BaseRepository getBaseRepository() {
        return null;
    }

    @Override
    public void add(BusTransRegisterVo param) {

    }
}
