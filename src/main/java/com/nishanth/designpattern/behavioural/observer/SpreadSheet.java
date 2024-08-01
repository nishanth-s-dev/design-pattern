package com.nishanth.designpattern.behavioural.observer;

public class SpreadSheet implements Observer{
    private final DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified and the value is " + dataSource.getValue());
    }
}
