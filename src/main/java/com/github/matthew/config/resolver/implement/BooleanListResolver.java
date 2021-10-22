package com.github.matthew.config.resolver.implement;

import com.github.matthew.config.resolver.ValueResolver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BooleanListResolver implements ValueResolver<List<Boolean>> {

    @Override
    public List<Boolean> resolve(Object value) {
        return new ArrayList<>((Collection<Boolean>) value);
    }
}
