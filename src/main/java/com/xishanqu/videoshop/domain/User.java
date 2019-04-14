package com.xishanqu.videoshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @Function: 用户实体类
 * @Author: BaoNing
 * @Date: 2019-04-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 微信openId
     */
    private String openId;

    /**
     * 昵称
     */
    private String name;

    /**
     * 头像
     */
    private String headImg;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户签名
     */
    private String sign;

    /**
     * 城市
     */
    private String city;

    /**
     * 性别:0表示女,1表示男
     */
    private Integer sex;

    /**
     * 创建时间
     */
    private Date createTime;

}
