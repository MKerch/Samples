package com.builder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kerch
 */
public class PhoneBuider {
    
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;
    
    public PhoneBuider setOs(String os) {
        this.os = os;
        return this;
    }
    
    public PhoneBuider setRam(int ram) {
        this.ram = ram;
        return this;
    }
    
    public PhoneBuider setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    
    public PhoneBuider setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    
    public PhoneBuider setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, ram, processor, screenSize, battery);
    }
}
