package com.wky.book.config;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component
public class TokenCache {
    private Cache<String, String> cache = CacheBuilder.newBuilder()
            .expireAfterWrite(30, TimeUnit.DAYS) // 设置缓存过期时间为30分钟
            .build();

    /**
     *  获取value
     * @param key 缓存key
     * @return 缓存值
     */
    public String get(String key) {
        String token = cache.getIfPresent(key);
        if (token == null) {
            // 从数据库或其他地方获取token
            token = UUID.randomUUID().toString();
            cache.put(key, token);
        }
        return token;
    }

    public void delete(String userId) {
        cache.invalidate(userId);
    }

    /**
     *  手动添加token到缓存
     * @param key 用户id
     * @param token 用户token
     */
    public void set(String key, String token) {
        cache.put(key, token);
    }
}
