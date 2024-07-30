package com.nishanth.designpattern.behavioural.templatemethod.Task;

import com.nishanth.designpattern.behavioural.templatemethod.AuditTrail;

public abstract class Task {
    protected final AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void executeTask() {
        auditTrail.record();
        doExecute(); // This method is called as hook
    }

    // concrete classes can override this method for own logic like [ transfer money, generate report ]
    protected abstract void doExecute();
}
