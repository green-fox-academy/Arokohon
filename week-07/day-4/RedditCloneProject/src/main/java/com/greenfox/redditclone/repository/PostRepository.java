package com.greenfox.redditclone.repository;

import com.greenfox.redditclone.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long>{
}
