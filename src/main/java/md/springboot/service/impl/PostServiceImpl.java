package md.springboot.service.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.entity.Post;
import md.springboot.repository.PostRepository;
import md.springboot.service.PostService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository repository;

    @Override
    public Flux<Post> retrieve() {
        return repository.findAll();
    }

    @Override
    public Mono<Post> retrieveById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Post> create(Mono<Post> post) {
        return repository.saveAll(post).next();
    }
}
