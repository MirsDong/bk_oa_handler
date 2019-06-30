package com.ueboot.shiro.controller.business.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class BusTransRegisterVo {
    private Date dateHandler;
    private String handoverMatter;
    private String transfer;
    private String receiver;
    private String supervisor;
    private String remark;
}
