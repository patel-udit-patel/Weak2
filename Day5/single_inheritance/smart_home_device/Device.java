package Day5.single_inheritance.smart_home_device;

public class Device {
    int deviceId;
    String status;

    Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    void displayStatus(){
        System.out.println("Device ID "+this.deviceId);
        System.out.println("Device status "+this.status);
    }
}
