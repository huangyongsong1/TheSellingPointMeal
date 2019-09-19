package com.song.collect.domain.entity;

import java.util.Date;
import lombok.Data;

/**
 * @author song
 */
@Data
public class Collect {
    /**
    * 收藏id
    */
    private Integer collectId;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 菜品id
    */
    private Integer cid;

    /**
    * 一级分类id
    */
    private Integer categoryId;

    /**
    * 创建时间
    */
    private Date createdTime;

    /**
    * 更新时间
    */
    private Date updatedTime;

    /**
    * 状态值，1表示删除，0表示存在
    */
    private Integer flag;
}