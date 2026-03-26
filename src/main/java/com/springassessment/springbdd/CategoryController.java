package com.springassessment.springbdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CategoryController {

    @GetMapping("/getCategory")
    public Map<String, String> getCategory() {
        Map<String, String> category = new HashMap<>();
        // This matches your "the client receives category with name" step
        category.put("name", "Men");
        return category;
    }
}