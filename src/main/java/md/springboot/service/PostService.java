package md.springboot.service;

import md.springboot.entity.Post;
import reactor.core.publisher.Flux;

public interface PostService {

    Flux<Post> retrieve();
}
