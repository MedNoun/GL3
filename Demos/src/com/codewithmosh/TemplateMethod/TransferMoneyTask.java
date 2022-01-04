package com.codewithmosh.TemplateMethod;

public class TransferMoneyTask extends TaskTemplate {
    
    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    protected void doExecute(){
        System.out.println("Transfering Money ! ");
    }
}
