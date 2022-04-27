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
@TableName("p_user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("客户ID")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty("客户姓名")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("客户性别  0男1女")
    @TableField("user_sex")
    private Integer userSex;

    @ApiModelProperty("身份证号")
    @TableField("user_idcard")
    private String userIdcard;

    @ApiModelProperty("出生日期")
    @TableField("user_born")
    private LocalDateTime userBorn;

    @ApiModelProperty("年龄")
    @TableField("user_age")
    private Integer userAge;

    @ApiModelProperty("籍贯 用户输入")
    @TableField("user_place")
    private String userPlace;

    @ApiModelProperty("联系电话")
    @TableField("user_phone")
    private String userPhone;

    @ApiModelProperty("婚姻状况（0已婚1未婚2离异3丧偶）")
    @TableField("user_marry")
    private Integer userMarry;

    @ApiModelProperty("政治面貌(1党员  2团员 3群众 4其他)")
    @TableField("user_politics")
    private Integer userPolitics;

    @ApiModelProperty("居住情况(0 自购  1 租房   2 养老院)")
    @TableField("user_reside")
    private Integer userReside;

    @ApiModelProperty("客户类型（0 五保户，1独居）")
    @TableField("user_type_id")
    private Integer userTypeId;

    @ApiModelProperty("社保类型 0 有1无")
    @TableField("user_social")
    private Integer userSocial;

    @ApiModelProperty("服务情况ID  1离世、0已签约、2.已结束")
    @TableField("situation_id")
    private Integer situationId;

    @ApiModelProperty("户籍地址")
    @TableField("user_location")
    private String userLocation;

    @ApiModelProperty("服务站ID")
    @TableField("station_id")
    private Integer stationId;

    @ApiModelProperty("照片路径 （用户照片限制图片大小）")
    @TableField("user_picture")
    private String userPicture;

    @ApiModelProperty("备注")
    @TableField("user_comment")
    private String userComment;


}
