package com.dao;

import com.pojo.books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bookmapper {
    int add(books books);

    int deletebyid(@Param("id") int id);

    int updatebook(books books);

    books query(@Param("ID") int id);

    List<books> queryall();

    books querybookbyname(@Param("bookName") String name);
}
