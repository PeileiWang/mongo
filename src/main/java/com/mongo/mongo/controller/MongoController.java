package com.mongo.mongo.controller;

import com.mongo.mongo.domain.User;
import com.mongo.mongo.enums.ResultEnum;
import com.mongo.mongo.service.MongoDBService;
import com.mongo.mongo.domain.Result;
import com.mongo.mongo.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Wangpl
 * Time 2018/8/10 17:52
 */
@RestController
@RequestMapping("/mongo")
public class MongoController {

    @Autowired
    MongoDBService mongoDBService;

    @PostMapping("/insert")
    public Result insert(@RequestBody User user) {
        mongoDBService.insert(user);
        return ResultUtils.success(ResultEnum.SUCCESS);
    }

    @GetMapping("/findall")
    public Result findAll() {
        return ResultUtils.success(ResultEnum.SUCCESS, mongoDBService.findAll(User.class));
    }

    @GetMapping(value = "/findonebyid")
    public Result findOne(@RequestParam ("id") int id) {
        Query query = new Query();
        query.with(new Sort(Sort.Direction.ASC, "age"));
        return ResultUtils.success(ResultEnum.SUCCESS,
                mongoDBService.find(User.class, new Query(Criteria.where("_id").is(id))));
    }
}
