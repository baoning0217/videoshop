package com.xishanqu.videoshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @Function: 集实体
 * @Author: BaoNing
 * @Date: 2019-04-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Episode {

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 集标题
     */
    private String title;

    /**
     * 第几集
     */
    private Integer num;

    /**
     * 时长
     */
    private String duration;

    /**
     * 封面图
     */
    private String coverImg;

    /**
     * 视频id
     */
    private Integer videoId;

    /**
     * 集概述
     */
    private String summary;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 章节主键id
     */
    private Integer chapterId;

}
