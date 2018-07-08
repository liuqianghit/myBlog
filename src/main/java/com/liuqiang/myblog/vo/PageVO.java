package com.liuqiang.myblog.vo;

import lombok.Data;

@Data
public class PageVO<T> {
    private int size;
    private int index;
    private T data;
}
