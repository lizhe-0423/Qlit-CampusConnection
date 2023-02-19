package com.qlit.utils;

import com.qlit.user.entity.Users;
import lombok.val;

import java.util.HashMap;
import java.util.Map;

/**
 * jwt hutool工具类
 */
public class JWTUtil {
    public static String createJwt(Users users){
        Map<String, Object> map = new HashMap<String, Object>() {
            private static final long serialVersionUID = 1L;
            {
                put("uid", Integer.parseInt(users.getUserId()));
                put("expire_time", System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 15);
            }
        };

        val token = cn.hutool.jwt.JWTUtil.createToken(map, "1234".getBytes());
        return token;
    }
    public static boolean validateJwt(String token){
        if(cn.hutool.jwt.JWTUtil.verify(token,"1234".getBytes())){
            return true;
        }
        else return false;
    }
}
