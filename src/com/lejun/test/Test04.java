package com.lejun.test;

import com.lejun.model.Article;
import com.lejun.model.Reply;
import com.lejun.service.IArticleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 15/3/21.
 */
public class Test04 {

    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("config/spring-core.xml");
        IArticleService service =(IArticleService)ctx.getBean("articleService");

        List<Reply> list=new ArrayList<Reply>();

        Reply reply1=new Reply("admin","test");
        Reply reply2 =new Reply("admi01","test test");
        list.add(reply1);
        list.add(reply2);

        Article article =new Article("222220120012","test","conent this ok");

        article.setReplies(list);
        service.save(article);
    }
}
