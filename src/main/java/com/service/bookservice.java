package com.service;

import com.pojo.books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bookservice {
    int add(books books);

    int deletebyid(int id);

    int updatebook(books books);

    books query(int id);

    List<books> queryall();

    books querybook(String name);
}
