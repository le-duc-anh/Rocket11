/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author my pc
 */
public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Deprecated
    public int getId() {
        return id;
    }

    public String getIdV2() {
        return "MSV" + id;
    }

    public String getName() {
        return name;
    }

}
