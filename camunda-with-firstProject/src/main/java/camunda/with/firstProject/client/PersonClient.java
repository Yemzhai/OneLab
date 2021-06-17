package camunda.with.firstProject.client;

import camunda.with.firstProject.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "person")
public interface PersonClient {
    @RequestMapping("person/{id}")
    Person findPersonById(@PathVariable("id") long id);
}
