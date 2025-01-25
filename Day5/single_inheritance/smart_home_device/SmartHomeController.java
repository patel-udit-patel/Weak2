package Day5.single_inheritance.smart_home_device;

public class SmartHomeController {
    public static void main(String[]args) {
        Device d1 = new Device(123, "On");
        d1.displayStatus();
        Thermostat t1=new Thermostat(234,"On","28'celsius");
        t1.displayStatus();
    }
}
