package com.ttestoo.snakeyaml.demo;

import org.yaml.snakeyaml.Yaml;

/**
 * @Author 领悟。
 * @Date 2021/8/12 10:06 下午
 */
public class SnakeYamlTest {
    public static void main(String[] args) {
        // 序列化测试
        User user = new User();
        user.setName("test");
        user.setAge(20);
        Yaml yaml1 = new Yaml();
        String dump1 = yaml1.dump(user);
        System.out.println("snakeyaml序列化测试：");
        System.out.println(dump1);

        //反序列化测试
        String dump2 = "!!com.ttestoo.snakeyaml.demo.User {age: 30, name: admin}";
        Yaml yaml2 = new Yaml();
        Object load = yaml2.load(dump2);
        System.out.println("snakeyaml反序列化测试：");
        System.out.println(load.getClass());
        System.out.println(load);
    }
}
