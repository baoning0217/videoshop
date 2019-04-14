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
public class VideoOrder {

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户标识
     */
    private String openId;

    /**
     * 订单唯一标识
     */
    private String outTradeNo;

    /**
     * 支付状态,0表示未支付,1表示已支付
     */
    private Integer state;

    /**
     * 订单生成时间
     */
    private Date createTime;

    /**
     * 支付回调时间
     */
    private Date notifyTime;

    /**
     * 支付金额
     */
    private Integer totalFee;

    /**
     * 微信昵称
     */
    private String nickname;

    /**
     * 微信头像
     */
    private String headImg;

    /**
     * 视频主键
     */
    private Integer videoId;

    /**
     * 视频名称
     */
    private String videoTitle;

    /**
     * 视频图片
     */
    private String videoImg;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户ip地址
     */
    private String ip;

    /**
     * 订单状态,0表示未删除,1表示已删除
     */
    private Integer del;

}
