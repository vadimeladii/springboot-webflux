package md.springboot.controller;

import md.springboot.entity.Post;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/post")
public interface PostController {

    @GetMapping
    List<Post> retrieve();

    @GetMapping("/{id}")
    Post retrieveById(@PathVariable String id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Post create(@RequestBody Post post);
}
