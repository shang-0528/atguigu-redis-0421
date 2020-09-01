package com.atguigu.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Protocol;

public class Jedistest {

    @Test
    public void testJedisPool(){
        // 1.准备连接信息，主机地址和端口号
        String host = "192.168.153.102";
        int port = Protocol.DEFAULT_PORT;

        // 2.创建jedis对象
        Jedis jedis = new Jedis(host, port);

        // 3.调用jedis对象的方法远程操作jedis服务器
        String ping = jedis.ping();
        System.out.println("ping = " + ping);

        // 4.redis方法和命令的名字是一样的
        Long lpush = jedis.lpush("fruit", "apple", "banana", "orange");
        System.out.println(lpush);



        jedis.close();

    }


}
