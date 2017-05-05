package java1702.javase.reflect.demo.b;

/**
 * Created by xiaozhu
 * on 2017/5/5
 */
// 强耦合 -> 松散耦合 解耦合
public class Service {
    private DeviceWriter deviceWriter;

//    public Service(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }
//
//    public void setDeviceWriter(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
