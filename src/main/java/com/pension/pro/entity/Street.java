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
@TableName("p_street")
@ApiModel(value = "Street对象", description = "")
public class Street implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("服务地址id")
    @TableId(value = "street_id", type = IdType.AUTO)
    private Integer streetId;

    @ApiModelProperty("地址（地图上拾取地址）")
    @TableField("street_address")
    private String streetAddress;

    @ApiModelProperty("详细地址（手动输入）")
    @TableField("street_details")
    private String streetDetails;

    @ApiModelProperty("用户ID")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("X坐标")
    @TableField("street_x")
    private String streetX;

    @ApiModelProperty("Y坐标")
    @TableField("street_y")
    private String streetY;

    @ApiModelProperty("是否是默认地址(0不是，1是)")
    @TableField("street_default")
    private Integer streetDefault;


}
