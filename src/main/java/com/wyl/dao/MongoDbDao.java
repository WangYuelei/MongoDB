package com.wyl.dao;

import com.wyl.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

/**
 * @ClassName MongoDbDao
 * @Description TODO
 * @Author wyl
 * @Date 2022/4/22 16:44
 */
@Component
public class MongoDbDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Student s) {
        mongoTemplate.save(s);
    }

    public Student get(Query query) {
        Student one = mongoTemplate.findOne(query, Student.class);
        return one;
    }
}
