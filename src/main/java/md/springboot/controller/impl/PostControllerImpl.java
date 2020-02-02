package md.springboot.controller.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.controller.PostController;
import md.springboot.entity.Post;
import md.springboot.service.PostService;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class PostControllerImpl implements PostController {

    private final PostService service;

    @Override
    public Flux<Post> retrieve() {
        return service.retrieve();
    }
}
