package com.nishanth.designpattern.behavioural.observer;

public class Chart implements Observer{
    private final DataSource datasource;

    public Chart(DataSource datasource) {
        this.datasource = datasource;
    }

    @Override
    public void update() {
        System.out.println("Chart got notified and the value is " + datasource.getValue());
    }
}
