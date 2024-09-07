package com.guanhf.a01sigleton2;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
    // 定义最多能生产的实例数量
    private static int maxNumOfEmperor = 2;
    // 每个皇帝都有名字, 使用一个ArrayList来容纳, 每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<>();
    // 定义一个列表, 容纳所有皇帝实例
    private static ArrayList<Emperor> emperorList = new ArrayList<>();
    // 当前皇帝的序列号
    private static int countNumOfEmperor = 0;
    // 产生所有对象
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i+1) + "帝"));
        }
    }
    private Emperor() {

    }
    private Emperor(String name) {
        nameList.add(name);
    }
    public static Emperor getInstance() {
        Random random = new Random();
        // 随机拉出一位皇帝
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }
    // emperor say
    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
