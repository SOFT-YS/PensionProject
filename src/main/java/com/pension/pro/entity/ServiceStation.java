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
@TableName("p_service_station")
@ApiModel(value = "ServiceStation对象", description = "")
public class ServiceStation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("服务站ID")
    @TableId(value = "station_id", type = IdType.AUTO)
    private Integer stationId;

    @ApiModelProperty("服务站名称")
    @TableField("station_title")
    private String stationTitle;

    @ApiModelProperty("地区表ID（街道ID）")
    @TableField("station_address")
    private String stationAddress;

    @ApiModelProperty("服务站负责人姓名")
    @TableField("station_name")
    private String stationName;

    @ApiModelProperty("服务站负责人电话")
    @TableField("station_phone")
    private String stationPhone;

    @ApiModelProperty("状态（0启用 1停用）默认开启  创建时")
    @TableField("station_condition")
    private Integer stationCondition;

    @ApiModelProperty("服务站备注")
    @TableField("station_other")
    private String stationOther;

    @ApiModelProperty("详细地址")
    @TableField("station_detailed")
    private String stationDetailed;


}
