package com.leo.moreMysql.modules.master.log.web;


import com.leo.moreMysql.modules.master.log.service.LogTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: moreMysql
 * @Package: com.leo.moreMysql.modules.master.log.web
 * @ClassName: LogTestController
 * @Description: java类-测试controller
 * @Author: liujm
 * @CreateDate: 20190319 10:24:46
 * @UpdateUser: 更新者
 * @UpdateDate: 20190319 10:24:46
 * @UpdateRemark: 无
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/common")
public class LogTestController {

    @Resource
    private LogTestService logTestService;

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    @ResponseBody
    public String error() {
//        responseBase.setResult(CodeMessage.PARAM_FAILED_EXPLAIN);
//        return logTestService.getList();
        return logTestService.getList2();
    }



}
