package md.springboot.service;

import md.springboot.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> retrieve();

    Optional<Post> retrieveById(String id);

    Post create(Post post);
}
