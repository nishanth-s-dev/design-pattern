package com.nishanth.designpattern.behavioural.templatemethod;

import com.nishanth.designpattern.behavioural.templatemethod.Task.Task;
import com.nishanth.designpattern.behavioural.templatemethod.Task.TransferMoneyTask;

public class Client {
    /*
    * Code duplication - Every time we need to add task, we need to add logic/code for AuditTrail in that task.
    * Nobody forcing to add auditTrail. Which is bad. What if we forgot to add auditTrail in new task?. Compiler won't tell us.
     */

    // Issue solved with template method pattern
    public static void main(String[] args) {
        Task transferMoney = new TransferMoneyTask();
        transferMoney.executeTask();
    }
}
