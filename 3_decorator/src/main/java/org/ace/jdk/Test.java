package org.ace.jdk;

import java.io.*;

/**
 * Created by Liangsj on 2018/4/2.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new UpperInputStream(new BufferedInputStream(new FileInputStream("3_decorator/data/test.txt")));
        while((c = in.read()) >=0) {
            System.out.print((char)c);
        }
        in.close();

        new BufferedReader(new InputStreamReader(new FileInputStream("a.txt"),"utf-8"));
    }
}
