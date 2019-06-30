package com.ueboot.shiro.service.business;

import com.ueboot.core.repository.BaseRepository;
import com.ueboot.shiro.entity.BusinessTransferRegister;
import org.springframework.stereotype.Repository;

@Repository
public interface BusTransRegisterRepository extends BaseRepository<BusinessTransferRegister, Long> {
}
