package com.lejun.test;

import com.lejun.model.Person;
import com.mongodb.Mongo;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by apple on 15/3/21.
 */
public class Test02 {

      public  static void main(String[] args) throws Exception{
          MongoOperations operations =new MongoTemplate(new Mongo(),"demo");
          operations.insert(new Person("2012012029","testst"));

      }
}
