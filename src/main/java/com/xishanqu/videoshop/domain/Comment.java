package com.xishanqu.videoshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @Function:
 * @Author: BaoNing
 * @Date: 2019-04-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 内容
     */
    private String content;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户头像
     */
    private String headImg;

    /**
     * 昵称
     */
    private String name;

    /**
     * 评分
     */
    private Double point;

    /**
     * 点赞数
     */
    private Integer up;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 视频id
     */
    private Integer videoId;

}
