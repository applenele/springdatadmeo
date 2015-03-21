package com.lejun.service;

import com.lejun.model.Person;
import com.lejun.repository.PersonRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by apple on 15/3/21.
 */
@Service("personService")
public class PersonService implements  IPersonService {

    @Resource
    private MongoTemplate mongoTemplate;



    @Override
    public List<Person> getAll() {
        return mongoTemplate.findAll(Person.class);
    }
}
