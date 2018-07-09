package com.example.redis;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisService {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.123.110");
        System.out.println("连接成功");
        jedis.set("name", "zjy");
        System.out.println("我的名字是：" + jedis.get("name"));


        // 列表存储
        jedis.lpush("list", "a");
        jedis.lpush("list", "b");
        jedis.lpush("list", "c");
        jedis.lpush("list", "d");
        List<String> list = jedis.lrange("list", 0, 2);
        for (String i : list) {
            System.out.println("取到了" + i);
        }




    }
}
