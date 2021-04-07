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
public final class PrimaryStudent extends Student {

    public static int counterPrimary = 0;

    public PrimaryStudent(int id, String name) throws Exception {
        super(id, name);
        counterPrimary++;
    }

  

}
