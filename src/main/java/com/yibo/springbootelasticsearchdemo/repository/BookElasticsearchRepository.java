package com.yibo.springbootelasticsearchdemo.repository;

import com.yibo.springbootelasticsearchdemo.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wb-hyb441488
 * @Date: 2019/1/7 20:00
 * @Description:
 *
 * ElasticsearchRepository
 * 这个是必须的，respository提供了一些基本的方法可以直接使用，如果需要自己定义方法，则在下面的类里面增加方法即可
 */

@Repository
public interface BookElasticsearchRepository extends ElasticsearchRepository<Book,String> {

}
