package com.leo.moreMysql.modules.master.log.dao;

import org.apache.ibatis.annotations.Mapper;


/**
 * @ProjectName: moreMysql
 * @Package: com.leo.moreMysql.modules.master.log.dao
 * @ClassName: LogTestDao
 * @Description: java类-测试controller
 * @Author: liujm
 * @CreateDate: 20190319 10:24:46
 * @UpdateUser: 更新者
 * @UpdateDate: 20190319 10:24:46
 * @UpdateRemark: 无
 * @Version: 1.0
 */
@Mapper
public interface LogTestDao {

    /**
     * 测试
     *
     * @return
     */
    String getTestData();
}
