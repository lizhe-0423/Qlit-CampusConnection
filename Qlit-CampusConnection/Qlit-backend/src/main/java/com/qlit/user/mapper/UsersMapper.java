package com.qlit.user.mapper;

import com.qlit.user.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * qlit用户表 Mapper 接口
 * </p>
 *
 * @author 荔枝
 * @since 2023-02-17
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}
