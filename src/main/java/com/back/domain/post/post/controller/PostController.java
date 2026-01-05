package com.back.domain.post.post.controller;

import com.back.domain.post.post.document.Post;
import com.back.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/post")
public class PostController {
    private final PostService postService;

    @GetMapping("{id}")
    public ResponseEntity<Post> post(@PathVariable String id){
        Post post = postService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(post);
    }
}
