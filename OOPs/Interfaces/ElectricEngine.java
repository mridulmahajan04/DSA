package OOPs.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine is starting");
    }

    public void stop() {
        System.out.println("Engine is stopping");
    }
}
