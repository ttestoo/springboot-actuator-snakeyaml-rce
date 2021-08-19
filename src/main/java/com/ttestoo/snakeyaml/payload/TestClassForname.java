package com.ttestoo.snakeyaml.payload;

/**
 * @Author 领悟。
 * @Date 2021/8/13 10:16 上午
 */
public class TestClassForname {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ClassLoader loader = TestClassForname.class.getClassLoader();

        System.out.println("\n=========initialize为false测试==========");
        Class<?> aClass1 = Class.forName("com.ttestoo.snakeyaml.payload.Test", false, loader);
//        aClass1.newInstance();

        System.out.println("\n=========initialize为true测试==========");
        Class<?> aClass2 = Class.forName("com.ttestoo.snakeyaml.payload.Test", true, loader);
        aClass2.newInstance();
    }
}

class Test {
    static {
        System.out.print("静态代码块被调用。。。\n");
    }

    public Test() {
        System.out.print("无参构造函数被调用。。。\n");
    }
}

