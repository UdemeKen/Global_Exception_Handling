package com.lightweb.LoggingImpl_lombok.service;

import com.lightweb.LoggingImpl_lombok.exceptions.AlreadyExistException;
import com.lightweb.LoggingImpl_lombok.pojo.ApiResponse;
import com.lightweb.LoggingImpl_lombok.pojo.Article;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    public ApiResponse addArticle(Article request){
        if (request.getCode() == 1){
            throw new AlreadyExistException("Article already exist");
        }
        return new ApiResponse("Created Successfully", HttpStatus.OK.value(), request);
    }
}