/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import entity.CPU;
import entity.Car;
import entity.Car.Engine;

/**
 *
 * @author my pc
 */
public class InnerClass {

    public void question1() {

        CPU cpu = new CPU(100);
        CPU.Ram ram = cpu.new Ram(8, "HP");
        CPU.Processor processor = cpu.new Processor(4, "Dell");

        // getClockspeed
        System.out.println(ram.getClockSpeed());

        // get cache
        System.out.println(processor.getCache());
    }

    public void question2() {

        Car car = new Car("Mazda", "8WD");

        Engine engine = car.new Engine();
        engine.setEngineType("Crysler");

        car.setEngine(engine);

        car.printInfor();
    }
}
