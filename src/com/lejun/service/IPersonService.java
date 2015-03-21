package com.lejun.service;

import com.lejun.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by apple on 15/3/21.
 */
public interface IPersonService {
    List<Person> getAll();
}
