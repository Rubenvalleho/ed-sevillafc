package com.rubenvj.sevillafc.features.news.domain;

public class News {
    public final String newsId;
    public final String title;
    public final String description;

    public News(String newsId, String title, String description) {
        this.newsId = newsId;
        this.title = title;
        this.description = description;
    }
}
