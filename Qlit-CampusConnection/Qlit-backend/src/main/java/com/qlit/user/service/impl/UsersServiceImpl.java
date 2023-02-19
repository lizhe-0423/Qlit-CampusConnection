package com.qlit.user.service.impl;

import cn.hutool.core.util.IdUtil;
import com.alibaba.nacos.shaded.com.google.errorprone.annotations.Var;
import com.qlit.user.entity.Users;
import com.qlit.user.mapper.UsersMapper;
import com.qlit.user.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * <p>
 * qlit用户表 服务实现类
 * </p>
 *
 * @author 荔枝
 * @since 2023-02-17
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

    @Resource
    IUsersService iUsersService;

    // 增加用户信息
    public boolean addUser(String username,String password){
        val users = new Users();
        users.setUserName(username);
        users.setUserPassword(password);

        users.setId(UUID.fromString(IdUtil.simpleUUID()));
        boolean save = iUsersService.save(users);
        return save;
    }
    // 删除用户信息
    public boolean delUser(Users users){
        boolean save = iUsersService.removeById(users);
        return save;
    }
    // 修改用户信息
    public boolean updUser(Users users){
        boolean save = iUsersService.updateById(users);
        return save;
    }
    // 查询用户信息
    public Users selUser(String username,String password){
        val users = new Users();
        users.setUserName(username);
        users.setUserPassword(password);
        val byId = iUsersService.getById(users.getUserId());
        return byId;
    }
}
