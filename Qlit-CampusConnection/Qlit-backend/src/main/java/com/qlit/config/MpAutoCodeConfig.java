package com.qlit.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MpAutoCodeConfig {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/qlit_campus?useUnicode=true&characterEncoding=utf8&useSSL=false", "root", "011026")
                .globalConfig(builder -> {
                    builder.author("荔枝") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("Qlit-backend/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.qlit") // 设置父包名
                            .moduleName("course"); // 设置父包模块名
                })
                .strategyConfig(builder -> {
                    builder.addInclude("course") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
