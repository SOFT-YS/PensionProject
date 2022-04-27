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
@TableName("p_schedule")
@ApiModel(value = "Schedule对象", description = "")
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("服务人员服务计划id")
    @TableId(value = "schedule_id", type = IdType.AUTO)
    private Integer scheduleId;

    @ApiModelProperty("用户ID")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("服务人员ID")
    @TableField("staff_id")
    private Integer staffId;

    @ApiModelProperty("服务项目ID")
    @TableField("service_id")
    private Integer serviceId;

    @ApiModelProperty("服务地址id")
    @TableField("street_id")
    private Integer streetId;

    @ApiModelProperty("工单编号")
    @TableField("schedule_number")
    private Integer scheduleNumber;

    @ApiModelProperty("创建时间")
    @TableField("schedule_creation_time")
    private LocalDateTime scheduleCreationTime;

    @ApiModelProperty("开始时间")
    @TableField("schedule_start_time")
    private LocalDateTime scheduleStartTime;

    @ApiModelProperty("结束时间")
    @TableField("schedule_end_time")
    private LocalDateTime scheduleEndTime;

    @ApiModelProperty("所耗工时（分钟为单位   将来计算出工时）")
    @TableField("schedule_man_hours")
    private Integer scheduleManHours;

    @ApiModelProperty("状态（0待服务 1服务中  2待审核   3服务完成)")
    @TableField("schedule_state")
    private Integer scheduleState;

    @ApiModelProperty("处理意见")
    @TableField("schedule_resolution")
    private String scheduleResolution;

    @ApiModelProperty("计划开始时间（精确到小时  ）")
    @TableField("schedule_start")
    private Integer scheduleStart;


}
