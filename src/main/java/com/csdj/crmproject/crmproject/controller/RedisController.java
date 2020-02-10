package com.csdj.crmproject.crmproject.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @version 1.0
 * @ClassName RedisController
 * @Author wuzl
 * @Date 2019/10/17
 **/
@RestController
public class RedisController {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/get/{key}")
    public String getRedis(@PathVariable(name = "key") String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @GetMapping("/set/{key}/{value}")
    public String setRedis(@PathVariable(name = "key") String key, @PathVariable(name = "value") String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return "suceess";
    }

    @GetMapping("/setEntity")
    public String setEntity() {
        redisTemplate.opsForValue().set("user:list:all", null);
        return "success";
    }

    @GetMapping("/getEntity/{key}")
    public String getEntity(@PathVariable(name = "key") String key) {
        return JSON.toJSONString(redisTemplate.opsForValue().get(key));
    }

    @GetMapping("/delete/{key}")
    public Boolean deleteKey(@PathVariable(name = "key") String key) {
        redisTemplate.delete(key);
        return redisTemplate.hasKey(key);
    }

    /**
     * 列表
     * Lpush——先进后出，在列表头部插入元素
     * Rpush——先进先出，在列表的尾部插入元素
     * @return
     */
    @GetMapping("/list" )
    public List<String> listTest(){
        ListOperations<String, String> listOperations = redisTemplate .opsForList();
        listOperations.leftPush("list", "Hello");
        listOperations.leftPush("list" , "World");
        listOperations.leftPush("list", "Java");
        List<String> list = listOperations.range("list" ,0,2);
        return list;
    }

    /**
     * 集合
     * @return
     */
    @GetMapping("/set" )
    public Set<String> setTest(){
        SetOperations<String, String> setOperations = redisTemplate . opsForSet();
        setOperations.add( "set","Hel1o");
        setOperations.add("set","Hello");
        setOperations.add("set","World");
        setOperations.add (" set","World" );
        setOperations.add("set","Java");
        setOperations.add("set","Java");
        Set<String> set = setOperations . members( "set");
        return set;
    }

    /**
     * 有序集合
     * @return
     */
    @GetMapping("/zset")
    public Set<String> zsetTest(){
        ZSetOperations<String, String> zSetOperations = redisTemplate.opsForZSet();
        zSetOperations.add("zset", "Hello",1);
        zSetOperations.add("zset","World" ,2);
        zSetOperations.add(" zset", "Java" ,3);
        Set<String> set = zSetOperations . range("zset" ,0,2);
        return set;
    }

    /**
     * 哈希
     * @return
     */
    @GetMapping("/hash")
    public void hashTest(){
        HashOperations<String, String, String> zSetOperations = redisTemplate.opsForHash();
        zSetOperations.put("key", "hashKey","value");
        System.out.println(zSetOperations.get("key","hashKey"));
    }
}
