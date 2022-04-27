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
@TableName("p_admin_role")
@ApiModel(value = "AdminRole对象", description = "")
public class AdminRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户角色表")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户ID")
    @TableField("admin_id")
    private Integer adminId;

    @ApiModelProperty("角色ID")
    @TableField("role_id")
    private Integer roleId;


}
