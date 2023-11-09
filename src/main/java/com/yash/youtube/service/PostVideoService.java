package com.yash.youtube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.youtube.model.Video;

@Service
public class PostVideoService {
    
    List<Video> videos = new ArrayList<>();

    public void postVideo(Video bodyVideo) {
        Video video = new Video();
        video.setVideoId(bodyVideo.getVideoId());
        video.setTitle(bodyVideo.getTitle());
        video.setDescription(bodyVideo.getDescription());
        video.setComments(bodyVideo.getComments());
        videos.add(video);
    }

    public List<Video> allVideos() {
        return videos;
    }

    public Video videoWithId(Integer id) {

        for(Video v: videos) {
            if (v.getVideoId() == id)
                return v;
        }
        return null;
    }
}
