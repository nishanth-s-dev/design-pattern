package com.nishanth.designpattern.behavioural.observer;

// Chart and SpreadSheet instances using DataSource value. If value changed, those instance must be aware of this.
// To solve this problem, we can use Observer pattern.

public class Client {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        dataSource.setValue(10);

        SpreadSheet spreadSheetOne = new SpreadSheet();
        SpreadSheet spreadSheetTwo = new SpreadSheet();
        Chart chart = new Chart();

        dataSource.addObserver(spreadSheetOne);
        dataSource.addObserver(spreadSheetTwo);
        dataSource.addObserver(chart);

        dataSource.setValue(20);
    }
}
