package com.ueboot.shiro.controller.business;

import com.ueboot.core.http.response.Response;
import com.ueboot.shiro.controller.business.vo.BusTransRegisterVo;
import com.ueboot.shiro.entity.BusinessTransferRegister;
import com.ueboot.shiro.service.business.BusTransRegisterService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping(value = "/ueboot/business")
public class BusTransRegisterController {

    private final BusTransRegisterService service;

    @Autowired
    public BusTransRegisterController(BusTransRegisterService service) {
        this.service = service;
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "新增业务登记", notes = "新增业务登记")
    public Response<?> add(@RequestBody BusTransRegisterVo param) {
        if (param != null) {
            if ((param.getReceiver() != null) && (param.getSupervisor() != null) && (param.getTransfer() != null)) {
                service.add(param);
                return new Response<>();
            }else  return new Response<>(HttpStatus.SC_BAD_REQUEST).message("非法参数！！！");
        }
        return new Response<>();
    }

    @RequestMapping(value = "/pageList", method = RequestMethod.POST)
    @ApiOperation(value = "业务页面展示", notes = "业务页面展示")
    public Response<Page<BusinessTransferRegister>> pageList(
            @PageableDefault(value = 15, sort = { "id" }, direction = Sort.Direction.DESC) Pageable pageable) {
        Page<BusinessTransferRegister> entities = service.findBy(pageable);
        return new Response(entities);
    }


}
