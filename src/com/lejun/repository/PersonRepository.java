package com.lejun.repository;

import com.lejun.model.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by apple on 15/3/21.
 */
public interface PersonRepository extends CrudRepository<Person,String> {

}
