package com.lejun.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by apple on 15/3/21.
 */
@Document(collection = "person")
public class Person {

    private  String id;

    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Person(String id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
