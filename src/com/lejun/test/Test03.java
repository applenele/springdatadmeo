package com.lejun.test;

import com.lejun.model.Person;
import com.lejun.repository.PersonRepository;
import com.lejun.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by apple on 15/3/21.
 */
public class Test03 {


     public  static void main(String[] args) throws  Exception{
         ApplicationContext ctx=new ClassPathXmlApplicationContext("config/spring-core.xml");
         IPersonService service = (IPersonService) ctx.getBean("personService");
         List<Person> list = (List<Person>)service.getAll();

          for (Person person : list){
             System.out.println(person);
          }
     }
}
