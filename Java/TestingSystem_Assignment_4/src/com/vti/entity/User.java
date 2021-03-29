/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;

public abstract class User {

    private String name;
    protected double salaryRatio;

    public User(String name, double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    public abstract double calculatePay();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary ratio: " + salaryRatio);
        System.out.println("Pay: " + calculatePay());
    }
}
