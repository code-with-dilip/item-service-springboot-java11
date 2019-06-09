package com.learnspringboot.controller;

import com.learnspringboot.domain.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.learnspringboot.constants.ItemConstants.GET_ALL_ITEMS;

@RestController
public class ItemController {

    @GetMapping(GET_ALL_ITEMS)
    public ResponseEntity<?> items(){
        List<Item> items = List.of(new Item(1,"Google Home"),new Item(1,"LG TV") );
         return ResponseEntity.ok(items);
    }
}
