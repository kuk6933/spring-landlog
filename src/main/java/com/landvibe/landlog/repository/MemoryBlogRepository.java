package com.landvibe.landlog.repository;

import com.landvibe.landlog.domain.Blog;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class MemoryBlogRepository implements BlogRepository {

    private static Map<Long, Blog> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public void save(Blog blog) {
        blog.setId(++sequence);
        store.put(blog.getId(), blog);
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void delete(Long blogId) {
        store.remove(blogId);
    }

    @Override
    public Blog update(Long id, Blog blog) {
        store.put(id, blog);
        return blog;
    }

    @Override
    public List<Blog> findByCreatorId(Long creatorId) {
        return store.values().stream()
                .filter(blog -> blog.getCreatorId() == creatorId)
                .toList();
    }

    public void clearStore() {
        store.clear();
    }
}