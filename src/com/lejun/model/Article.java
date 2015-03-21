package com.lejun.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by apple on 15/3/21.
 */

@Document(collection = "article")
public class Article {

    private String id;

    private String title;

    private String content;

    private List<Reply> replies;

    public Article(String id, String title, String content) {
        this.content = content;
        this.id = id;
        this.title = title;
    }

    public Article() {
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }
}
