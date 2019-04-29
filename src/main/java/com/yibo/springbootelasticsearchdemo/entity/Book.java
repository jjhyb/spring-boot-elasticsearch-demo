package com.yibo.springbootelasticsearchdemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: wb-hyb441488
 * @Date: 2019/1/7 20:01
 * @Description: 与ES交互的Bean
 *
 * Document注解里面有很多参数，基本的配置有索引名称，库名称，还有分片等等
 */

@Document(indexName = "book",type = "book")
public class Book implements Serializable {

    /**
     * id
     */
    @Id
    private String id;

    /**
     * 书名
     */
    @Field
    private String name;

    /**
     * 价格
     */
    @Field
    private double price;

    /**
     * 书描述
     */
    @Field
    private String description;

    /**
     * 出版年限
     */
    @Field
    private Date publishedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
