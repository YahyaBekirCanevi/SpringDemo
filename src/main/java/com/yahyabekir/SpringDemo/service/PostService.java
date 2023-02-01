package com.yahyabekir.SpringDemo.service;

import com.yahyabekir.SpringDemo.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    public List<Post> getPosts(){
        return List.of(
                new Post(
                        "sad",
                        "saaadd",
                        List.of("aa", "bb")
                )
        );
    }
}
