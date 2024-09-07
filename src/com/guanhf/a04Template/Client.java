package com.guanhf.a04Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("-------H1型号悍马--------");
        System.out.println("H1型号的悍马是否需要喇叭声响?0-不需要 1-需要");
        HummerH1 h1 = new HummerH1();
        // 创建一个 InputStreamReader 对象，将标准输入流转换为字符流
        InputStreamReader inputStream = new InputStreamReader(System.in);
        // 创建一个 BufferedReader 对象，用于高效读取字符流
        BufferedReader reader = new BufferedReader(inputStream);
        // 从 BufferedReader 中读取一行文本，并存储在变量 type 中
        String type = reader.readLine();

        if(type.equals("0")){
            h1.setAlarm(false);
        }
        h1.run();
        System.out.println("\n-------H2型号悍马--------");
        HummerH2 h2 = new HummerH2();
        h2.run();
    }
}
