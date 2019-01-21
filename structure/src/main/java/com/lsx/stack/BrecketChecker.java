package com.lsx.stack;

import java.io.*;

public class BrecketChecker {
    private String words;

    public BrecketChecker(String words) {
        this.words = words;
    }

    public void check() {

        int length = words.length();
        Stack s = new Stack(length);
        for (int i = 0; i < length; i++) {
            char cur = words.charAt(i);
            switch (cur) {
                case '(':
                case '[':
                case '{':
                    s.push(cur);
                    break;
                case ')':
                case ']':
                case '}':
                    if (s.isEmpty()) {
                        System.out.println("匹配错误，符号:" + cur + " 下标：" + i);
                        return;
                    } else {
                        char preCur = s.pop();
                        if ((preCur == '(' && cur != ')') || (preCur == '[' && cur != ']') || (preCur == '{' && cur != '}')) {
                            System.out.println("匹配错误，符号:" + cur + " 下标：" + i);
                            return;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        if (!s.isEmpty()) {
            System.out.println("有括号没有闭合！");
        } else {
            System.out.println("匹配成功！");
        }
    }


    public static void main(String[] args) {
        try {
            System.out.println("请输入字符串！");
            InputStream in = System.in;
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String str = br.readLine();
            BrecketChecker brc = new BrecketChecker(str);
            brc.check();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
