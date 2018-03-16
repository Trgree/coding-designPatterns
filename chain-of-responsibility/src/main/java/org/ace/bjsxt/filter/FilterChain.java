package org.ace.bjsxt.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author L
 * @date 2018/3/16
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public String doFilter(String str) {
        String result = str;
        for(Filter filter : filters) {
            result = filter.doFilter(result);
        }
        return result;
    }
}
