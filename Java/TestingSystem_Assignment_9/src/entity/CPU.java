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
public class CPU {

    private int price;

    public CPU(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public class Processor {

        private int coreAmount;
        private String manufacturer;

        public Processor(int coreAmount, String manufacturer) {
            this.coreAmount = coreAmount;
            this.manufacturer = manufacturer;
        }

        public float getCache() {
            return (float) 4.3;
        }

        public int getCoreAmount() {
            return coreAmount;
        }

        public String getManufacturer() {
            return manufacturer;
        }

    }

    public class Ram {

        private int memory;
        private String manufacturer;

        public Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public float getClockSpeed() {
            return (float) 5.5;
        }

        public int getMemory() {
            return memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }
}
