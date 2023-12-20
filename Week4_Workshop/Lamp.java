class LampOperations {
    private boolean isOn;

    public LampOperations() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is now OFF.");
    }

    public void checkStatus() {
        System.out.println("The lamp is currently " + (isOn ? "ON" : "OFF"));
    }
}

public class Lamp {
    public static void main(String[] args) {
        LampOperations myLamp = new LampOperations();

        // Performing operations
        myLamp.turnOn();
        myLamp.checkStatus();

        myLamp.turnOff();
        myLamp.checkStatus();
    }
}
