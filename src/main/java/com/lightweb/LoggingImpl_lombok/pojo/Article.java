package com.lightweb.LoggingImpl_lombok.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {
    private int code;
    private String name;
}