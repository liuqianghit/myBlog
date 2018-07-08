package com.liuqiang.myblog.service;

import com.liuqiang.myblog.po.ArticlePO;
import com.liuqiang.myblog.vo.PageVO;

import java.util.List;

public interface IArticleService {
    List<ArticlePO> getAllArticle(PageVO<String> pageVO);
}
