package com.baron.entrance.dao;

import com.baron.entrance.model.SpiderTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Jason on 2017/6/13.
 */
public interface SpiderTemplateDao extends MongoRepository<SpiderTemplate, String> {
    SpiderTemplate findById(String id);
}
