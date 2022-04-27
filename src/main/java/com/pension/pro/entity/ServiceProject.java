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
@TableName("p_service_project")
@ApiModel(value = "ServiceProject对象", description = "")
public class ServiceProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("服务项目ID")
    @TableId(value = "service_id", type = IdType.AUTO)
    private Integer serviceId;

    @ApiModelProperty("项目名称")
    @TableField("service_name")
    private String serviceName;

    @ApiModelProperty("服务项目类别ID")
    @TableField("project_type_id")
    private Integer projectTypeId;

    @ApiModelProperty("项目价格")
    @TableField("service_money")
    private BigDecimal serviceMoney;

    @ApiModelProperty("项目状态(0停用，1启动)")
    @TableField("service_status")
    private Integer serviceStatus;

    @ApiModelProperty("项目工时(此项目服务时间)")
    @TableField("service_time")
    private LocalDateTime serviceTime;

    @ApiModelProperty("备注")
    @TableField("service_comment")
    private String serviceComment;


}
