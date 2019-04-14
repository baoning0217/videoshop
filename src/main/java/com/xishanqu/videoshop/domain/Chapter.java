package com.xishanqu.videoshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @Function: 章节实体
 * @Author: BaoNing
 * @Date: 2019-04-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chapter {

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 视频主键
     */
    private Integer videoId;

    /**
     * 章节名称
     */
    private String title;

    /**
     * 章节顺序
     */
    private Integer ordered;

    /**
     * 创建时间
     */
    private Date createTime;


}
