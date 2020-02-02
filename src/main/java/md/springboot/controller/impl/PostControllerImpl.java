package md.springboot.controller.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.controller.PostController;
import md.springboot.entity.Post;
import md.springboot.service.PostService;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class PostControllerImpl implements PostController {

    private final PostService service;

    @Override
    public Flux<Post> retrieve() {
        return service.retrieve();
    }

    @Override
    public Mono<Post> retrieveById(String id) {
        return service.retrieveById(id);
    }


}
