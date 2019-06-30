package com.ueboot.shiro.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "BUSINESS_TRANSFER")
@Api("业务交接登记簿")
public class BusinessTransferRegister {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private long id;

    @Temporal (TemporalType.TIMESTAMP)
    @Column(name = "DATE_HANDLER")
    @ApiModelProperty("交接日期")
    private Date dateHandler;

    @Column(name = "HANDOVER_MATTER")
    @ApiModelProperty("交接事项")
    private String handoverMatter;

    @Column(name = "TRANSFER")
    @ApiModelProperty("移交人")
    private String transfer;

    @Column(name = "RECEIVER")
    @ApiModelProperty("接收人")
    private String receiver;

    @ApiModelProperty("监交人")
    @Column(name = "SUPERVISOR")
    private String supervisor;

    @Column(name = "REMARK")
    @ApiModelProperty("备注")
    private String remark;

    @Column(name = "RECEIVER_STATUS")
    @ApiModelProperty("业务接收人审核：0-未审核，1审核通过")
    private Integer receiverStatus = 0;
    @Column(name = "SUPERVISOR_STATUS")
    @ApiModelProperty("业务监交人审核：0-未审核，1审核通过")
    private Integer supervisorStatus = 0;

}