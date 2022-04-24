package com.wyl.service;

import com.wyl.entity.Student;

public interface MongoDbService {
    void save();

    Student get();

    Student findAll();

    void update();

    void delete();
}
