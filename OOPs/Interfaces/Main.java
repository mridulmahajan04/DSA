package OOPs.Interfaces;

public class Main implements Media, Engine{
    @Override
    public void start() {
        System.out.println("Car Engine is started");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine is stopped");
    }

    public static void main(String[] args) {
        Engine m1 = new Main();
//        m1.start();
        Media.call();
        NiceCar car1 = new NiceCar();
        car1.startEngine();
        car1.startMusic();
        car1.stopMusic();
        car1.stopEngine();
    }


}
