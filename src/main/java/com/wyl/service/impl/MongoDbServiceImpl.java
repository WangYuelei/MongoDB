package com.wyl.service.impl;

import com.wyl.dao.MongoDbDao;
import com.wyl.entity.Hobbies;
import com.wyl.entity.Student;
import com.wyl.service.MongoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * @ClassName MongoDbServiceImpl
 * @Description TODO
 * @Author wyl
 * @Date 2022/4/22 16:43
 */
@Service
public class MongoDbServiceImpl implements MongoDbService {
    @Autowired
    private MongoDbDao mongoDbDao;

    @Override
    public void save() {
        Student s=new Student();
        s.setName("李四");
        s.setAge(17);
        s.setSex(1);
        s.setHeight(182);
        Hobbies h=new Hobbies();
        h.setHname("swing");
        s.setHobbies(h);
        mongoDbDao.save(s);
    }

    @Override
    public Student get() {
        Criteria criteriaName = Criteria.where("name").is("张三");
        Criteria criteriaAge = Criteria.where("age").is("10");
        Criteria criteria = new Criteria();
        criteria.andOperator(criteriaName,criteriaAge);
        Query query = new Query();
        query.addCriteria(criteria);
        return mongoDbDao.get(query);
    }

    @Override
    public Student findAll() {
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
