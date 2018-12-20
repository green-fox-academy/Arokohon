package com.greenfox.redditclone.service;

import com.greenfox.redditclone.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{


  @Override
  public List<Post> getPosts() {
    return null;
  }

  @Override
  public Post getPostById(long id) {
    return null;
  }

  @Override
  public void addPost(Post post) {

  }

  @Override
  public void editPost(long id) {

  }

  @Override
  public void deletePostById(long id) {

  }
}
