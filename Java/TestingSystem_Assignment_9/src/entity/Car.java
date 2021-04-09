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
public class Car {

    private String name;
    private String type;
    private Engine engine;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void printInfor() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Type: " + type);
        System.out.println("Car Engine: " + engine);
    }

    public class Engine {

        private String engineType;

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        @Override
        public String toString() {
            return engineType;
        }
    }

}
