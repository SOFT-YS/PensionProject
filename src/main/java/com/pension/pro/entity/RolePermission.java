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
@TableName("p_role_permission")
@ApiModel(value = "RolePermission对象", description = "")
public class RolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("角色权限ID")
    @TableId(value = "per_role_id", type = IdType.AUTO)
    private Integer perRoleId;

    @ApiModelProperty("角色ID")
    @TableField("role_id")
    private Integer roleId;

    @ApiModelProperty("权限ID")
    @TableField("per_id")
    private Integer perId;


}
