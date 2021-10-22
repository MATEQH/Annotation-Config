package com.github.matthew.config;

import com.github.matthew.config.resolver.implement.*;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.github.matthew.config.resolver.ValueResolver;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class ConfigHelper {

    private static Map<Type, ValueResolver<?>> resolverMap = Maps.newConcurrentMap();
    private static Table<Class<?>, Class<?>, ValueResolver<?>> resolverTable = HashBasedTable.create();

    static {
        resolverMap.put(String.class, new StringResolver());
        resolverMap.put(Boolean.class, new BooleanResolver());
        resolverMap.put(boolean.class, new BooleanResolver());
        resolverMap.put(Integer.class, new IntegerResolver());
        resolverMap.put(int.class, new IntegerResolver());
        resolverMap.put(Long.class, new LongResolver());
        resolverMap.put(long.class, new LongResolver());
        resolverTable.put(List.class, String.class, new StringListResolver());
        resolverTable.put(List.class, Boolean.class, new BooleanListResolver());
        resolverTable.put(List.class, Integer.class, new IntegerListResolver());
        resolverTable.put(List.class, Long.class, new LongListResolver());
        resolverTable.put(List.class, Float.class, new FloatListResolver());
    }

    public static Map<Type, ValueResolver<?>> getResolverMap() {
        return resolverMap;
    }

    public static Table<Class<?>, Class<?>, ValueResolver<?>> getResolverTable() {
        return resolverTable;
    }
}
