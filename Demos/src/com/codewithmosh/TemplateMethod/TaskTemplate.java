package com.codewithmosh.TemplateMethod;

public abstract class TaskTemplate {
    protected AuditTrail auditTrail;

    public TaskTemplate(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }
    public void execute(){
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
