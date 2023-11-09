package com.yash.youtube.model;

import java.util.List;

import lombok.Data;

@Data
public class Video {
    
    private Integer videoId;
    private String title;
    private String description;
    private List<String> comments;
}
