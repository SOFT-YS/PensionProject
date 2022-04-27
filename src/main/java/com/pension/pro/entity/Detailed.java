package com.pension.pro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("p_detailed")
@ApiModel(value = "Detailed对象", description = "")
public class Detailed implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("账户明细ID")
    @TableId(value = "detailed_id", type = IdType.AUTO)
    private Integer detailedId;

    @ApiModelProperty("角色ID")
    @TableField("role_id")
    private Integer roleId;

    @ApiModelProperty("操作时间(事件发生的时间)")
    @TableField("detailed_operate")
    private LocalDateTime detailedOperate;

    @ApiModelProperty("事件(充值，清算，陪同就医等)")
    @TableField("detailed_event")
    private String detailedEvent;

    @ApiModelProperty("工时(在原来工时上做的改变)")
    @TableField("detailed_add_time")
    private Integer detailedAddTime;

    @ApiModelProperty("金额(在原有金额上做的改变)")
    @TableField("detailed_add_money")
    private BigDecimal detailedAddMoney;

    @ApiModelProperty("工时余额(已充值或已使用后的剩余工时)")
    @TableField("detailed_time_balance")
    private Integer detailedTimeBalance;

    @ApiModelProperty("金额余额(已充值或已使用后的剩余金额)")
    @TableField("detailed_money_balance")
    private Integer detailedMoneyBalance;

    @ApiModelProperty("操作人(什么角色扣除/增加了多少金额)")
    @TableField("user_id")
    private Integer userId;


}
