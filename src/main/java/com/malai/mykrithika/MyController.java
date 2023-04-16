package com.malai.mykrithika;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class MyController {

    @GetMapping("/ingredients")
    ResponseEntity<String> greetings(@RequestParam("list") String ingredients) {
        return ResponseEntity.ok("hello " + ingredients);
    }

    @PostMapping("{name}")
    ResponseEntity<String> greetingsPost(@PathVariable String name) {
        return ResponseEntity.ok("hello " + name);
    }
}

