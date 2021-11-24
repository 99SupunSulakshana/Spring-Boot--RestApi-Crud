package com.example.restsample.repository;

import com.example.restsample.model.RestModel;
import org.springframework.data.repository.CrudRepository;

public interface RestRepository extends CrudRepository<RestModel, Integer> {
      RestModel getById(Integer id);
}
