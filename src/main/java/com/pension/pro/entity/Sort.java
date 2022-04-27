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
@TableName("p_sort")
@ApiModel(value = "Sort对象", description = "")
public class Sort implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("客户类型ID")
    @TableId(value = "sort_id", type = IdType.AUTO)
    private Integer sortId;

    @ApiModelProperty("客户ID")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("客户类型名称(0.无偿 1.有偿 2.自费)")
    @TableField("sort_name")
    private Integer sortName;

    @ApiModelProperty("工时/月")
    @TableField("sort_time")
    private Integer sortTime;


}
