package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts(int pageNo,int pageSize);

    PostDto getPostById(long Id);

    PostDto updatePost(PostDto postDto, long Id);

    void deletePostById(long id);
}
