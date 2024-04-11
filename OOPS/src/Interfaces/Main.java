package Interfaces;

public class Main {
    public static void main(String[] args) {

//        Engine car = new Car();
//        car.acc();
//        car.stop();
//        car.start();

//        Media carMedia = new Car(); theres a problem here cause of the ambiguity of the functions in media and engine hence to fix this we will make another class for media which implements media
//        carMedia.start();
//        carMedia.stop();
      NiceCar car = new NiceCar();
      car.start();
      car.startMusic();
      car.stop();
    }

}
