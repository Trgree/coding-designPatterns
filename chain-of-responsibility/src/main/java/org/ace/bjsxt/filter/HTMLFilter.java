package org.ace.bjsxt.filter;

/**
 * @author L
 * @date 2018/3/16
 */
public class HTMLFilter implements Filter {
    @Override
    public String doFilter(String str) {
        return str.replace("<", "[").replace(">", "]");
    }
}
