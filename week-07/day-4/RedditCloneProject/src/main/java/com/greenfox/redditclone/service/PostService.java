package com.greenfox.redditclone.service;

import com.greenfox.redditclone.model.Post;

import java.util.List;

public interface PostService {

  List<Post> getPosts();
  Post getPostById(long id);
  void addPost(Post post);
  void editPost(long id);
  void deletePostById(long id);
}
