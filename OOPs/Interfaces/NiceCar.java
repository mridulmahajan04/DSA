package OOPs.Interfaces;

public class NiceCar {
    private Engine engine = new ElectricEngine();
    private Media media = new SoundTrack();

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void startMusic() {
        media.start();
    }

    public void stopMusic() {
        media.stop();
    }

}
