package com.ueboot.shiro.controller.business.vo;

import com.ueboot.core.http.response.Response;
import com.ueboot.shiro.controller.organization.vo.OrganizationFindReq;
import com.ueboot.shiro.controller.organization.vo.OrganizationResp;
import com.ueboot.shiro.entity.Organization;
import com.ueboot.shiro.service.business.BusTransRegisterService;
import com.ueboot.shiro.service.resources.ResourcesService;
import com.ueboot.shiro.service.user.UserService;
import com.ueboot.shiro.shiro.ShiroEventListener;
import com.ueboot.shiro.shiro.ShiroService;
import com.ueboot.shiro.shiro.processor.ShiroProcessor;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
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
    @ApiOperation(value = "新增业务登记",notes = "新增业务登记")
    public Response<?> add(@RequestBody BusTransRegisterVo param){
        if (param !=null) {
            service.add(param);
        }
        String test = "hello";
        return new Response<>(test);
    }


}
