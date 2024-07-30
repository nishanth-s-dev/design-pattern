package com.nishanth.designpattern.behavioural.templatemethod.Task;

import com.nishanth.designpattern.behavioural.templatemethod.AuditTrail;

public class TransferMoneyTask extends Task {

    public TransferMoneyTask() {
        super();
    }

    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer Money");
    }
}
