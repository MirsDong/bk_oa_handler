package com.ueboot.shiro.service.business.impl;

import com.ueboot.core.repository.BaseRepository;
import com.ueboot.core.service.impl.BaseServiceImpl;
import com.ueboot.shiro.controller.business.vo.BusTransRegisterVo;
import com.ueboot.shiro.entity.BusinessTransferRegister;
import com.ueboot.shiro.service.business.BusTransRegisterRepository;
import com.ueboot.shiro.service.business.BusTransRegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
@ConditionalOnMissingBean(name = "busTransRegisterService")
public class BusTransRegisterServiceImpl extends BaseServiceImpl<BusinessTransferRegister> implements BusTransRegisterService {

    @Resource
    private BusTransRegisterRepository registerRepository;

    @Override
    protected BaseRepository getBaseRepository() {
        return registerRepository;
    }

    @Override
    public void add(BusTransRegisterVo param) {
        BusinessTransferRegister entity = new BusinessTransferRegister();
        BeanUtils.copyProperties(param, entity);
        registerRepository.save(entity);
    }
}
