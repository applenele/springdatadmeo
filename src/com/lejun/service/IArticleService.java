package com.lejun.service;

import com.lejun.model.Article;

import java.util.List;

/**
 * Created by apple on 15/3/21.
 */
public interface IArticleService {

    public List<Article> getAll();

    public void save(Article article);


}
