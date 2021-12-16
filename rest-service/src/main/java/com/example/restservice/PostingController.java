package com.example.restservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostingController {

    @PostMapping("/posting")
    public Posting posting(@RequestParam(value = "First", defaultValue = "Jeden") String first,
                           @RequestParam(value = "Second", defaultValue = "Dwa") String second)
                            {
        return new Posting(first,second);
    }
}
