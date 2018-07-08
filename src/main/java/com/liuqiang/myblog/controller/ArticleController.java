package com.liuqiang.myblog.controller;

import com.liuqiang.myblog.po.ArticlePO;
import com.liuqiang.myblog.service.IArticleService;
import com.liuqiang.myblog.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private IArticleService articleService;
    @PostMapping
    public List<ArticlePO> getAll(@RequestBody PageVO<String> pageVO){
        return articleService.getAllArticle(pageVO);
    }
}
