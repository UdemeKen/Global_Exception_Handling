package com.lightweb.LoggingImpl_lombok.controllers;

import com.lightweb.LoggingImpl_lombok.pojo.ApiResponse;
import com.lightweb.LoggingImpl_lombok.pojo.Article;
import com.lightweb.LoggingImpl_lombok.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

@PostMapping("/api/v1/article/add")
    public ApiResponse addArticle(@RequestBody Article article){
        return articleService.addArticle(article);
    }
}