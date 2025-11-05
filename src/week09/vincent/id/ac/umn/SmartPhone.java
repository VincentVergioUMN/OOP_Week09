package week09.vincent.id.ac.umn;

public class SmartPhone extends Device implements Power, VolumeControl, Device.Connectivity {
    private int currentVolume;
    private String connectedNetwork;

    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;

    public SmartPhone(String brand, String model) {
        super(brand, model);
        this.currentVolume = 0;
        this.connectedNetwork = null;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the device...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the device...");
    }

    @Override
    public void increaseVolume(int level) {
        if (level <= 0) {
            return;
        }
        int old = currentVolume;
        currentVolume = Math.min(MAX_VOLUME, currentVolume + level);
        int actualChange = currentVolume - old;
        System.out.println("Increasing volume by " + actualChange + " levels.");
    }

    @Override
    public void decreaseVolume(int level) {
        if (level <= 0) {
            return;
        }
        int old = currentVolume;
        currentVolume = Math.max(MIN_VOLUME, currentVolume - level);
        int actualChange = old - currentVolume;
        System.out.println("Decreasing volume by " + actualChange + " levels.");
    }

    @Override
    public void connectToWiFi(String networkName) {
        this.connectedNetwork = networkName;
        System.out.println("Connecting to WiFi: " + networkName);
    }

    @Override
    public void disconnectFromWiFi() {
        if (connectedNetwork != null) {
            connectedNetwork = null;
            System.out.println("Disconnecting from WiFi...");
        } else {
            System.out.println("No WiFi connected to disconnect.");
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getConnectedNetwork() {
        return connectedNetwork;
    }
}