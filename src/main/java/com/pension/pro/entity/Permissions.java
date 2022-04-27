package com.pension.pro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("p_permissions")
@ApiModel(value = "Permissions对象", description = "")
public class Permissions implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("权限表ID")
    @TableId(value = "per_id", type = IdType.AUTO)
    private Integer perId;

    @ApiModelProperty("权限名称")
    @TableField("per_name")
    private String perName;

    @ApiModelProperty("权限路径")
    @TableField("per_menu")
    private String perMenu;

    @ApiModelProperty("状态(0启用1禁用)")
    @TableField("per_state")
    private Integer perState;

    @ApiModelProperty("创建权限的父级ID")
    @TableField("per_pid")
    private Integer perPid;


}
