package com.service;

import com.dao.bookmapper;
import com.pojo.books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookserviceimpl implements bookservice {
    @Autowired
    private bookmapper bookmapper;

    @Override
    public int add(books books) {

        return bookmapper.add(books);
    }

    @Override
    public int deletebyid(int id) {
        return bookmapper.deletebyid(id);
    }

    @Override
    public int updatebook(books books) {
        return bookmapper.updatebook(books);
    }

    @Override
    public books query(int id) {
        return bookmapper.query(id);
    }

    @Override
    public List<books> queryall() {
        return bookmapper.queryall();
    }

    @Override
    public books querybook(String name) {
        return bookmapper.querybookbyname(name);
    }

    public void setBookmapper(com.dao.bookmapper bookmapper) {
    }
}
