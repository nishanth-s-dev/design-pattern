package com.nishanth.designpattern.creational.prototype;

public interface Component {
    void render();
    Component clone() throws CloneNotSupportedException;
}
