package com.leo.moreMysql.modules.second.user.dao;

import org.apache.ibatis.annotations.Mapper;


/**
 * @ProjectName: moreMysql
 * @Package: com.leo.moreMysql.modules.second.user.dao
 * @ClassName: UserTestDao
 * @Description: java类 启动类
 * @Author: liujm
 * @CreateDate: 20190319 10:24:46
 * @UpdateUser: 更新者
 * @UpdateDate: 20190319 10:24:46
 * @UpdateRemark: 无
 * @Version: 1.0
 */
@Mapper
public interface UserTestDao {

    /**
     * 测试
     *
     * @return
     */
    String getUserTestData();

}
