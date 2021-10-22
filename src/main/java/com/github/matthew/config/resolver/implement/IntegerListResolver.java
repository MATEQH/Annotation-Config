package com.github.matthew.config.resolver.implement;

import com.github.matthew.config.resolver.ValueResolver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IntegerListResolver implements ValueResolver<List<Integer>> {

    @Override
    public List<Integer> resolve(Object value) {
        return new ArrayList<>((Collection<Integer>) value);
    }
}
