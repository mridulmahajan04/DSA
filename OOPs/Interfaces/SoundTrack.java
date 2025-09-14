package OOPs.Interfaces;

public class SoundTrack implements Media{
    @Override
    public void start() {
        System.out.println("Start Playing Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop Playing Music");
    }
}
