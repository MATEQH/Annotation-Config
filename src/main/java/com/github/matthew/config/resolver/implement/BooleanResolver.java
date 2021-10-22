package com.github.matthew.config.resolver.implement;

import com.github.matthew.config.resolver.ValueResolver;

public class BooleanResolver implements ValueResolver<Boolean> {

    @Override
    public Boolean resolve(Object value) {
        return Boolean.valueOf(value.toString());
    }
}
