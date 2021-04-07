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
public final class SecondaryStudent extends Student {

    public static int counterSecondary = 0;
    
    public SecondaryStudent(int id, String name) throws Exception {
        super(id, name);
        counterSecondary++;
    }
}
