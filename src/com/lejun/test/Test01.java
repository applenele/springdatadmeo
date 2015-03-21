package com.lejun.test;

import com.lejun.model.Person;
import com.mongodb.*;
import org.springframework.data.mongodb.core.MongoActionOperation;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.Query;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by apple on 15/3/21.
 */

public class Test01 {
      public static void main(String[] args) throws  Exception{

          //MongoOperations mongoOps = new MongoTemplate(new Mongo(), "database");

         // mongoOps.insert(new Person("111111", "admin"));

          //mongoOps.findOne(new Query(where("name").is("Joe")), Person.class);

          Mongo mongo = new Mongo();

          for (String name : mongo.getDatabaseNames()){
              System.out.println(name);
          }

          DB db=mongo.getDB("demo");

          DBCollection collection = db.getCollection("person");

          add(collection);
          DBCursor cursor = collection.find();

          while (cursor.hasNext()){
              System.out.println(cursor.next());
          }



      }

    public static void add(DBCollection collection){
        List<DBObject>  list= new ArrayList<DBObject>();
        DBObject person1=new BasicDBObject();
        person1.put("username","test");
        list.add(person1);
        collection.insert(list);
    }




}
