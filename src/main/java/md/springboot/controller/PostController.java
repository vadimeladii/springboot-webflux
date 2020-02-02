package md.springboot.controller;

import md.springboot.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/post")
public interface PostController {

    @GetMapping
    Flux<Post> retrieve();

    @GetMapping("/{id}")
    Mono<Post> retrieveById(@PathVariable String id);
}
