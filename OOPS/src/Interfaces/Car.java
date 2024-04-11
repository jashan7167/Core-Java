package Interfaces;

public class Car implements Engine,Brake,Media{


    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I am starting engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating like a normal car");
    }
}
