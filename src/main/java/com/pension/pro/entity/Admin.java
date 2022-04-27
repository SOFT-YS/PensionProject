package com.pension.pro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author YU
 * @since 2022-04-25
 */
@Getter
@Setter
@TableName("p_admin")
@ApiModel(value = "Admin对象", description = "")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("管理员ID")
    @TableId(value = "admin_id", type = IdType.AUTO)
    private Integer adminId;

    @ApiModelProperty("管理员账户")
    @TableField("admin_name")
    private String adminName;

    @ApiModelProperty("管理员密码")
    @TableField("admin_password")
    private String adminPassword;

    @ApiModelProperty("管理员昵称")
    @TableField("admin_nickname")
    private String adminNickname;

    @ApiModelProperty("管理员电话")
    @TableField("admin_phone")
    private String adminPhone;

    @ApiModelProperty("创建时间")
    @TableField("admin_create_time")
    private LocalDateTime adminCreateTime;

    @ApiModelProperty("修改时间")
    @TableField("admin_update_time")
    private LocalDateTime adminUpdateTime;

    @ApiModelProperty("管理员状态(0启用1禁用)")
    @TableField("admin_statues")
    private String adminStatues;


}
