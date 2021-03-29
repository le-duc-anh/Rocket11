/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.backend;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.Phone;
import com.vti.entity.VietnamesePhone;
import com.vti.entity.Waiter;

/**
 *
 * @author my pc
 */
public class Abstraction {

    public void question1() {
        Phone phone = new VietnamesePhone();
        phone.insertContact("ĐA", "0397658963");
        phone.removeContact("ĐA");
        phone.updateContact("ĐA", "0978785136");
        phone.searchContact("ĐA");
    }

    public void question2n3() {
        Employee employee = new Employee("ĐA", 7.0);
        employee.displayInfo();

        Manager manager = new Manager("Hoàng Nam", 9.8);
        manager.displayInfo();

        Waiter waiter = new Waiter("Việt Tùng", 4.9);
        waiter.displayInfo();
    }

}
