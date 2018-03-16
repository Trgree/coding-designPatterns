package org.ace.bjsxt.filter;

/**
 * 责任链模式
 * @author L
 * @date 2018/3/16
 */
public class Main {
    public static void main(String[] args) {
        String msg =" 敏感信息，<sctipt>,";
        MsgProcessor processor = new MsgProcessor();
        processor.setMsg(msg);
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter()).addFilter(new SesitiveFilter());
        processor.setFilterChain(filterChain);
        String result = processor.process();
        System.out.println(result);
    }
}
