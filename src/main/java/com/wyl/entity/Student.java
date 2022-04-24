package com.wyl.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
//之所以没有像 mysql那样需要@table标签去标注我们的表名与实体类的对应关系。是因为 mongodb默认类名即与表名对应。
public class Student{
    @Id
    private String id;
    private String name;
    private Integer age;
    private Integer sex;
    private Integer height;
    private Hobbies hobbies;
}
 
 
 
