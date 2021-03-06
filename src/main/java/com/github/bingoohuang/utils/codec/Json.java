package com.github.bingoohuang.utils.codec;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;
import java.util.Map;

public class Json {
    public static String jsonWithType(Object obj) {
        return JSON.toJSONString(obj, SerializerFeature.WriteClassName);
    }

    @SuppressWarnings("unchecked")
    public static <T> T unJsonWithType(String json) {
        return (T) JSON.parse(json);
    }

    public static String json(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static Map<String, Object> unJson(String json) {
        return JSON.parseObject(json);
    }

    public static <T> T unJson(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    public static <T> List<T> unJsonArray(String json, Class<T> clazz) {
        return JSON.parseArray(json, clazz);
    }
}
