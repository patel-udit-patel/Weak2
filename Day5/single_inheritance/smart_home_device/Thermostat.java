package Day5.single_inheritance.smart_home_device;

public class Thermostat extends  Device{
    String temperatureSetting;

    Thermostat(int deviceId,String status,String temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature setting "+this.temperatureSetting);
    }
}
