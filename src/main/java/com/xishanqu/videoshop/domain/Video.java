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
public class Video {

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 概述
     */
    private String summary;

    /**
     * 封面图
     */
    private String coverImg;

    /**
     * 观看数
     */
    private Integer viewNum;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否上线0表示未上线,1表示上线
     */
    private Integer online;

    /**
     * 评分
     */
    private Double point;

}
