package camunda.with.firstProject;

import camunda.with.firstProject.client.PersonClient;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindOlderPerson implements JavaDelegate {
    @Autowired
    private PersonClient personClient;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        boolean firstPersonOlder;
        long person1Id = (long)delegateExecution.getVariable("person1Id");
        long person2Id = (long)delegateExecution.getVariable("person2Id");
        Person person1 = personClient.findPersonById(person1Id);
        Person person2 = personClient.findPersonById(person2Id);
        firstPersonOlder = person1.getAge() > person2.getAge();
        delegateExecution.setVariable("firstPersonOlder", firstPersonOlder);

    }
}
