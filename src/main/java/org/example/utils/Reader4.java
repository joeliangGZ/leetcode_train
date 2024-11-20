package org.example.utils;

public class Reader4 {

    // 模拟文件读取的类
    private String content;
    private int index;

    public Reader4(String content) {
        this.content = content;
        this.index = 0;
    }

    // 模拟 read4 方法，每次读取 4 个字符
    public int read4(char[] buf) {
        int count = 0;
        for (int i = 0; i < 4 && index < content.length(); i++) {
            buf[i] = content.charAt(index++);
            count++;
        }
        return count;
    }
}
