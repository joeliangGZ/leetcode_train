package org.example.simple.str;


    /* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

import org.example.utils.Reader4;

public class readNCharactersGivenRead4 extends Reader4 {
    private int bufferPointer = 0;
    private int bufferSize = 0;
    private char[] buffer = new char[4];

    public readNCharactersGivenRead4(String content) {
        super(content);
    }

    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return The number of characters read
     */
    public int read(char[] buf, int n) {
        int cnt = 0; // 记录已经读取的字符数

        while (cnt < n) {
            // 如果缓冲区指针已经到达缓冲区末尾，则从文件中读取新的数据到缓冲区
            if (bufferPointer == bufferSize) {
                bufferSize = read4(buffer);
                bufferPointer = 0;
                // 如果 read4 返回 0，表示文件已经读取完毕
                if (bufferSize == 0) {
                    break;
                }
            }
            // 从缓冲区读取字符到 buf 中
            buf[cnt++] = buffer[bufferPointer++];
        }

        return cnt;
    }

    public static void main(String[] args) {
        readNCharactersGivenRead4 readNCharactersGivenRead4
                = new readNCharactersGivenRead4("hello world");
        char[] buf = new char[7];
        int n = 7;
        int cnt = readNCharactersGivenRead4.read(buf, n);
        System.out.println(cnt);
        System.out.println(buf);
    }
}
