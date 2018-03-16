package org.ace.bjsxt.filter;

/**
 * @author L
 * @date 2018/3/16
 */
public class MsgProcessor {
    private String msg;
    private FilterChain filterChain = new FilterChain();

    public String process(){
        return filterChain.doFilter(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }
}
