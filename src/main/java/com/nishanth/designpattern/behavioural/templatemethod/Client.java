package com.nishanth.designpattern.behavioural.templatemethod;

public class Client {
    /*
    * Code duplication - Every time we need to add task, we need to add logic/code for AuditTrail in that task.
    * Nobody forcing to add auditTrail. Which is bad. What if we forgot to add auditTrail in new task?. Compiler won't tell us.
     */
    public static void main(String[] args) {
    }
}
