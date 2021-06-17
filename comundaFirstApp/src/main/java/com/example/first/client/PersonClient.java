package com.example.first.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(name = "person")
public interface PersonClient {
    @RequestMapping("person/{id}")
    Object findPersonById(@PathVariable("id") long id);
}
