package com.springproject.nosql.services;

import java.util.List;
import java.util.Optional;

import com.springproject.nosql.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.nosql.domain.User;
import com.springproject.nosql.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(String id) {
      Optional<User> obj = repository.findById(id);
      return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
  }
}
