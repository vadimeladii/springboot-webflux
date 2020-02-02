package md.springboot.controller;

import md.springboot.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@RequestMapping("/post")
public interface PostController {

    @GetMapping
    Flux<Post> retrieve();
}
