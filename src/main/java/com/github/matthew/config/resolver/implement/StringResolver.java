package com.github.matthew.config.resolver.implement;

import com.github.matthew.config.resolver.ValueResolver;

public class StringResolver implements ValueResolver<String> {

    @Override
    public String resolve(Object value) {
        return value.toString();
    }
}
