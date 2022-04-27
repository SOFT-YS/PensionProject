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
@TableName("p_system")
@ApiModel(value = "System对象", description = "")
public class System implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("系统设置ID")
    @TableId(value = "system_id", type = IdType.AUTO)
    private Integer systemId;

    @ApiModelProperty("网站名称")
    @TableField("system_name")
    private String systemName;

    @ApiModelProperty("描述")
    @TableField("system_description")
    private String systemDescription;

    @ApiModelProperty("管理员ID")
    @TableField("admin_id")
    private Integer adminId;

    @ApiModelProperty("管理员账户")
    @TableField("admin_user")
    private String adminUser;

    @ApiModelProperty("管理员密码")
    @TableField("admin_password")
    private String adminPassword;

    @ApiModelProperty("底部版权信息")
    @TableField("admin_copyright")
    private String adminCopyright;

    @ApiModelProperty("备案号")
    @TableField("admin_record")
    private String adminRecord;


}
