/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;

public class Employee extends User {

    public Employee(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return salaryRatio * 420;
    }

}
