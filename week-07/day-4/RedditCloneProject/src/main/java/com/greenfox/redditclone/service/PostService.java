package com.greenfox.redditclone.service;

import com.greenfox.redditclone.repository.Post;

import java.util.List;

public interface PostService {

  List<Post> getPosts();
  Post getPostById(long id);
  void addPost(Post post);
  void editPost(Post post);
  void deletePostById(long id);
}
