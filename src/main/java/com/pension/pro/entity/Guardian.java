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
@TableName("p_guardian")
@ApiModel(value = "Guardian对象", description = "")
public class Guardian implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("监护人ID")
    @TableId(value = "guardian_id", type = IdType.AUTO)
    private Integer guardianId;

    @ApiModelProperty("监护人姓名")
    @TableField("guardian_name")
    private String guardianName;

    @ApiModelProperty("监护人地址")
    @TableField("guardian_location")
    private String guardianLocation;

    @ApiModelProperty("监护人电话")
    @TableField("guardian_phone")
    private String guardianPhone;

    @ApiModelProperty("关系（0子女.....）监护人与客户的关系")
    @TableField("guardian_relation")
    private Integer guardianRelation;

    @ApiModelProperty("是否为紧急联系人(0是1否)")
    @TableField("guardian_instancy")
    private Integer guardianInstancy;

    @ApiModelProperty("客户ID")
    @TableField("user_id")
    private Integer userId;


}
