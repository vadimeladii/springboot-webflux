package md.springboot.controller.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.controller.PostController;
import md.springboot.entity.Post;
import md.springboot.service.PostService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostControllerImpl implements PostController {

    private final PostService service;

    @Override
    public List<Post> retrieve() {
        return service.retrieve();
    }

    @Override
    public Post retrieveById(String id) {
        return service.retrieveById(id).orElse(null);
    }

    @Override
    public Post create(Post post) {
        return service.create(post);
    }
}
