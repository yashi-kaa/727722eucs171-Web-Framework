package com.project.demo.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
@GetMapping("/SS")
public String message()
{
    return "Hello good afternoon";
}
}
