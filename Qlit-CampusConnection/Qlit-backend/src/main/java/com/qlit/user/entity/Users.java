package com.qlit.user.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * qlit用户表
 * </p>
 *
 * @author 荔枝
 * @since 2023-02-17
 */
@ApiModel(value = "Users对象", description = "qlit用户表")
@TableName("users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private UUID id;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("是否删除(0-未删, 1-已删)")
    @TableLogic
    private Integer isDeleted;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPassword;

    @ApiModelProperty("学号")
    private String userId;

    @ApiModelProperty("学院")
    private String userCollege;

    @ApiModelProperty("专业")
    private String userMajor;

    @ApiModelProperty("个人介绍")
    private String userIntroduce;

    @ApiModelProperty("头像")
    private String userPhoto;

    @ApiModelProperty("性别")
    private String userSex;

    @ApiModelProperty("年龄")
    private String userAge;

    @Version
    @ApiModelProperty("版本号")
    private Integer version;

}
