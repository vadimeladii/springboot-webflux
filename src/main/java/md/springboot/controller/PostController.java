package md.springboot.controller;

import md.springboot.entity.Post;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/post")
public interface PostController {

    @GetMapping
    Flux<Post> retrieve();

    @GetMapping("/{id}")
    Mono<Post> retrieveById(@PathVariable String id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Mono<Post> create(@RequestBody Mono<Post> post);
}
