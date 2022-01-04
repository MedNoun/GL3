package com.codewithmosh.TemplateMethod;

public class GenerateReportTask extends TaskTemplate {
    
    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    protected void doExecute(){
        System.out.println("Generating report !");
    }
}
