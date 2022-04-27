package com.pension.pro.entity;

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
@TableName("p_staff_project_type")
@ApiModel(value = "StaffProjectType对象", description = "")
public class StaffProjectType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("服务项目类别ID 例如：清理服务，慰问服务")
    @TableId("project_type_id")
    private Integer projectTypeId;

    @ApiModelProperty("服务人员ID")
    @TableField("staff_id")
    private Integer staffId;


}
