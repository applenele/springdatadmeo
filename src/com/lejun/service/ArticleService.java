package com.lejun.service;

import com.lejun.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by apple on 15/3/21.
 */
@Service("articleService")
public class ArticleService implements  IArticleService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Article> getAll() {
        return null;
    }

    @Override
    public void save(Article article) {
         mongoTemplate.save(article,"article");
    }
}
