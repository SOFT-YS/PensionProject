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
@TableName("p_order")
@ApiModel(value = "Order对象", description = "")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("订单ID")
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    @ApiModelProperty("订单编号")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("客户ID")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("服务人员ID")
    @TableField("staff_id")
    private Integer staffId;

    @ApiModelProperty("服务地址ID（客户地址  拉取是默认的）")
    @TableField("street_id")
    private Integer streetId;

    @ApiModelProperty("服务站ID")
    @TableField("station_id")
    private Integer stationId;

    @ApiModelProperty("总工时")
    @TableField("account_work_time")
    private Integer accountWorkTime;

    @ApiModelProperty("创建时间")
    @TableField("order_done")
    private LocalDateTime orderDone;

    @ApiModelProperty("此订单所需工时")
    @TableField("order_date")
    private Integer orderDate;

    @ApiModelProperty("完成工时")
    @TableField("order_goodjob")
    private Integer orderGoodjob;

    @ApiModelProperty("状态（0待接收  1服务中  2已完成 ）")
    @TableField("order_state")
    private Integer orderState;


}
