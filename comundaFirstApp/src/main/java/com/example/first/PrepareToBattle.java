package com.example.first;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class PrepareToBattle implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
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
