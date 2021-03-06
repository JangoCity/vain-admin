package com.vain.service;


import com.vain.base.service.BaseService;
import com.vain.common.ErrorCodeException;
import com.vain.entity.User;

/**
 * @author vain
 * @description: 用户service类
 * @date 2017/8/31 15:23
 */

public interface IUserService extends BaseService<User> {
    /**
     * 用户登录
     *
     * @param entity
     * @return
     */
    User login(User entity) throws ErrorCodeException;

    /**
     * 重置密码
     *
     * @param entity
     * @return
     */
    int resetPwd(User entity);

    /**
     * 锁定 / 解锁用户
     *
     * @param entity
     * @return
     */
    int lock(User entity);

    /**
     * 分配用户菜单权限
     *
     * @param entity
     */
    int assignUserMenu(User entity);

}
