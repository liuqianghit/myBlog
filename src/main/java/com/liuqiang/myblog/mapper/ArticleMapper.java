package com.liuqiang.myblog.mapper;

import com.liuqiang.myblog.po.ArticlePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<ArticlePO> getBriefArticle();
}
