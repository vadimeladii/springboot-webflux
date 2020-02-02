package md.springboot.service;

import md.springboot.entity.Post;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PostService {

    Flux<Post> retrieve();

    Mono<Post> retrieveById(String id);
}
