package com.jmworks.todoapi.repository;

import com.jmworks.todoapi.domain.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource
public interface TodoRepository extends PagingAndSortingRepository<Todo, Long> {

    List<Todo> findByIsDone(@Param("isDone") boolean isDone);

//    @Override
//    @RestResource(exported = true)
//    void deleteAll();

//    void deleteAllByIsDone(@Param("isDone") boolean isDone);

}