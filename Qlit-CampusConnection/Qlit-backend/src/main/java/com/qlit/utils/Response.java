package com.qlit.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Response {
    private  int code;
    private  String message;
    private  String data;

    //todo jwt 到底封装在消息体中吗？
    private static String jwt;

}
