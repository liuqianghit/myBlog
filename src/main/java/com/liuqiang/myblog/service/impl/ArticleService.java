package com.liuqiang.myblog.service.impl;

import com.liuqiang.myblog.po.ArticlePO;
import com.liuqiang.myblog.service.IArticleService;
import com.liuqiang.myblog.vo.PageVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService {
    @Override
    public List<ArticlePO> getAllArticle(PageVO<String> pageVO) {
        return null;
    }
}
