package com.lejun.model;

/**
 * Created by apple on 15/3/21.
 */
public class Reply {

    private String username;

    private String content;

    public Reply(String username, String  content) {
        this.content = content;
        this.username = username;
    }

    public Reply() {
    }

    @Override
    public String toString() {
        return "Reply{" +
                "content='" + content + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
