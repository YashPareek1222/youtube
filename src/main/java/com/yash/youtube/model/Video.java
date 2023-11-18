package com.yash.youtube.model;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    
    @Id
    private Integer id;
    private String title;
    private String description;
    private List<Comment> commentList = new CopyOnWriteArrayList<>();
    private VideoStatus videoStatus;
    private AtomicInteger likes = new AtomicInteger(0);
    private AtomicInteger dislikes = new AtomicInteger(0);
    private String videoUrl;
    private AtomicInteger viewCount = new AtomicInteger(0);

    public void incrementLikes() {
        likes.incrementAndGet();
    }

    public void decrementLikes() {
        likes.decrementAndGet();
    }

    public void incrementDisLikes() {
        dislikes.incrementAndGet();
    }

    public void decrementDisikes() {
        dislikes.decrementAndGet();
    }

    public void addComment(Comment comment) {
        commentList.add(comment);
    }
}
