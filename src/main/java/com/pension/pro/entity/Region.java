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
@TableName("p_region")
@ApiModel(value = "Region对象", description = "")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("地区id")
    @TableId(value = "region_id", type = IdType.AUTO)
    private Integer regionId;

    @ApiModelProperty("地区名称")
    @TableField("region_name")
    private String regionName;

    @ApiModelProperty("父级ID")
    @TableField("region_pid")
    private Integer regionPid;


}
