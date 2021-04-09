/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

public class Salary<N extends Number> {

    private N salary;

    public Salary(N salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" + "salary=" + salary + '}';
    }
}
