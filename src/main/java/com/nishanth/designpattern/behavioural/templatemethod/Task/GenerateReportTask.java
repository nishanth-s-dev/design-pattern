package com.nishanth.designpattern.behavioural.templatemethod.Task;

import com.nishanth.designpattern.behavioural.templatemethod.AuditTrail;

public class GenerateReportTask extends Task {

    public GenerateReportTask() {
        super();
    }

    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute(){
        System.out.println("Generate Report");
    }
}
