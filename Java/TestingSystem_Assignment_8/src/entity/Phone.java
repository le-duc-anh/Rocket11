/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

public class Phone<K, V> extends MyMap<K, V> {

    public Phone(K key, V value) {
        super(key, value);
    }

    public V getPhoneNumber() {
        return super.getValue();
    }

}
