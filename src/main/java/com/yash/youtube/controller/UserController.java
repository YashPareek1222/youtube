package com.yash.youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.youtube.model.Video;
import com.yash.youtube.service.UserService;

@RestController
@RequestMapping("/youtube")
public class UserController {
    
    @Autowired
    private UserService pService;

    @GetMapping("/get/{id}")
    private Video getVideo(@PathVariable Integer id) {
        return pService.videoWithId(id);
    }

    @PostMapping("/post")
    private void postVideoToStore(@RequestBody Video video) {
        pService.postVideo(video);
    }
}
