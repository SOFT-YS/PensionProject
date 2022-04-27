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
@TableName("p_staff")
@ApiModel(value = "Staff对象", description = "")
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("服务人员ID")
    @TableId(value = "staff_id", type = IdType.AUTO)
    private Integer staffId;

    @ApiModelProperty("服务人员名字")
    @TableField("staff_name")
    private String staffName;

    @ApiModelProperty("服务站ID")
    @TableField("station_id")
    private Integer stationId;

    @ApiModelProperty("服务人员性别（0男1女）")
    @TableField("staff_sex")
    private Integer staffSex;

    @ApiModelProperty("服务人员电话")
    @TableField("staff_phone")
    private String staffPhone;

    @ApiModelProperty("服务人员身份证号")
    @TableField("staff_card")
    private String staffCard;

    @ApiModelProperty("服务人员家庭住址")
    @TableField("staff_location")
    private String staffLocation;

    @ApiModelProperty("服务人员年龄")
    @TableField("staff_age")
    private Integer staffAge;

    @ApiModelProperty("备注")
    @TableField("staff_comment")
    private String staffComment;


}
