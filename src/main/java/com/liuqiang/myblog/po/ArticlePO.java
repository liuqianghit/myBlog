package com.liuqiang.myblog.po;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ArticlePO {
    private long id;
    private String title;
    private String label;
    private Date createTime;
    private Date modifyTime;
    private String category;
    private String content;
    private List<Long> tags;
}
