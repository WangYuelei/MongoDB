package com.wyl.controller;

import com.wyl.entity.Student;
import com.wyl.service.MongoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MongoDbController
 * @Description TODO
 * @Author wyl
 * @Date 2022/4/22 16:41
 */
@RestController
@RequestMapping("mongodb")
public class MongoDbController {
    @Autowired
    private MongoDbService mongoDbService;
    @RequestMapping("/save")
    public void save(){
         mongoDbService.save();
    }
    @RequestMapping("/get")
    public Student get(){
        return mongoDbService.get();
    }
    @RequestMapping("/findAll")
    public Student findAll(){
        return mongoDbService.findAll();
    }
    @RequestMapping("/update")
    public void update(){
        mongoDbService.update();
    }
    @RequestMapping("/delete")
    public void delete(){
        mongoDbService.delete();
    }

}
