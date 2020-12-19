package org.studyhub.springboot.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class RedisApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void testStringRedisTemplate() {

        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();

        String key = "Happy";

        String value = "Birthday";

        operations.set(key, value);

        String val = operations.get(key);
        System.out.println(val);

    }

}
