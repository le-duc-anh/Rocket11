/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

public class Staff<N> extends MyMap<N, String> {

    public Staff(N id, String name) {
        super(id, name);
    }

    public N getId() {
        return getKey();
    }

    public String getName() {
        return super.getValue();
    }
}
