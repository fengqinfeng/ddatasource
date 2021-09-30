package com.leo.moreMysql.modules.master.log.service;


import com.leo.moreMysql.modules.master.log.dao.LogTestDao;
import com.leo.moreMysql.modules.second.user.dao.UserTestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @ProjectName: moreMysql
 * @Package: com.leo.moreMysql.modules.master.log.service
 * @ClassName: LogTestService
 * @Description: java类-测试controller
 * @Author: liujm
 * @CreateDate: 20190319 10:24:46
 * @UpdateUser: 更新者
 * @UpdateDate: 20190319 10:24:46
 * @UpdateRemark: 无
 * @Version: 1.0
 */
@Service
public class LogTestService {

    @Resource
    private LogTestDao logTestDao;

    @Resource
    private UserTestDao userTestDao;


    /**
     * 测试
     *
     * @return
     */
    public String getList (){
        String  test = "testtest";

        test = logTestDao.getTestData();
        test += userTestDao.getUserTestData();

        return  test;
    }

    public String getList2(){
        String t;
        t = logTestDao.getmasterphone();
        t += userTestDao.getsecondphone();
        return t;
    }
}
