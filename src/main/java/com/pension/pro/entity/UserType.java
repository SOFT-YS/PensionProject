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
@TableName("p_user_type")
@ApiModel(value = "UserType对象", description = "")
public class UserType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("客户类型ID")
    @TableId(value = "user_type_id", type = IdType.AUTO)
    private Integer userTypeId;

    @ApiModelProperty("客户类型名称")
    @TableField("user_type_name")
    private String userTypeName;

    @ApiModelProperty("备注")
    @TableField("user_type_comment")
    private String userTypeComment;


}
