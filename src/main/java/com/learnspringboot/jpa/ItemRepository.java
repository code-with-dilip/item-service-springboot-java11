package com.learnspringboot.jpa;

import com.learnspringboot.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
