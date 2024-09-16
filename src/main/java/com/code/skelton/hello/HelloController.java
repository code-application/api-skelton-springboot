package com.code.skelton.hello;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Hello, CODE!と出力するコントローラー
 */
@RestController
public class HelloController {

    /*
     * "/"に対するリクエストにメッセージを返却する
     * 
     * @return message: Hello, CODE!というMap
     */
    @GetMapping("/")
    public Map<String, String> home() {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello, CODE!");
        return map;
    }

}
