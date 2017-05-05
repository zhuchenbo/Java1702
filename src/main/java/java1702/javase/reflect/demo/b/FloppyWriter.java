package java1702.javase.reflect.demo.b;

/**
 * Created by xiaozhu
 * on 2017/5/5
 */
public class FloppyWriter implements DeviceWriter {

    @Override
    public void writeToDevice() {
        System.out.println("write to floppy...");
    }
}
