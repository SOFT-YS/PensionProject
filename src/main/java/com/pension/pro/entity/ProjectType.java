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
@TableName("p_project_type")
@ApiModel(value = "ProjectType对象", description = "")
public class ProjectType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("服务项目类别ID")
    @TableId(value = "project_type_id", type = IdType.AUTO)
    private Integer projectTypeId;

    @ApiModelProperty("项目类别名称")
    @TableField("project_type_name")
    private String projectTypeName;

    @ApiModelProperty("备注")
    @TableField("project_type_comment")
    private String projectTypeComment;


}
