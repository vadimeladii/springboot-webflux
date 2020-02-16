package md.springboot.service.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.entity.Post;
import md.springboot.repository.PostRepository;
import md.springboot.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository repository;

    @Override
    public List<Post> retrieve() {
        return repository.findAll();
    }

    @Override
    public Optional<Post> retrieveById(String id) {
        return repository.findById(id);
    }

    @Override
    public Post create(Post post) {
        return repository.save(post);
    }
}
