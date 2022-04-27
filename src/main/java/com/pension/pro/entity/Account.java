package com.pension.pro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("p_account")
@ApiModel(value = "Account对象", description = "")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("账户ID")
    @TableId(value = "account_id", type = IdType.AUTO)
    private Integer accountId;

    @ApiModelProperty("客户ID")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("账户类型ID")
    @TableField("account_type_id")
    private Integer accountTypeId;

    @ApiModelProperty("总金额")
    @TableField("account_money")
    private BigDecimal accountMoney;

    @ApiModelProperty("所需月份")
    @TableField("account_month")
    private Integer accountMonth;

    @ApiModelProperty("总工时")
    @TableField("account_work_time")
    private Integer accountWorkTime;


}
