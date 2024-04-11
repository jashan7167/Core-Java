package Interfaces;

public class NiceCar {

    private Engine engine; //these are implemented by CDplayer
    private Media media; //these are implemented by PowerEngine

    public NiceCar() {
        engine = new PowerEngine();
        media = new CDplayer();
    }

    public NiceCar(Engine engine, Media media) {
        this.engine = engine;
        this.media = media;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        media.start();
    }

    public void stopMusic() {
        media.stop();
    }

    public void upgradeEngine(Engine engine)
    {
        this.engine = engine;
    }

}
