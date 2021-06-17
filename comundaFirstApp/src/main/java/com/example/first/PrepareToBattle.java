package com.example.first;

import com.example.first.client.PersonClient;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrepareToBattle implements JavaDelegate {
    @Autowired
    private PersonClient personClient;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int personId = (int)delegateExecution.getVariable("personId");
        personClient.findPersonById(personId);

        int kazakh = (int)delegateExecution.getVariable("kazakh");
        int zhongar = (int)(Math.random()*39);
        String battleStatus = "Undefined";
        boolean isWin = false;
        if(kazakh < 1 || kazakh > 10000){
            throw new BpmnError("kazakhNotFoundError");
        }
        if((kazakh - zhongar) >= 0){
            isWin = true;
            battleStatus = "Kazakh won";
        }else{
            battleStatus = "Zhongar won :(";
        }

        delegateExecution.setVariable("zhongar", zhongar);
        delegateExecution.setVariable("battleStatus", battleStatus);
        delegateExecution.setVariable("isWin", isWin);
    }
}
