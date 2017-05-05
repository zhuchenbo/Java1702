package java1702.javase.reflect.demo.a;

/**
 * Created by xiaozhu
 * on 2017/5/5
 * 高层应用类
 */
// 强耦合
public class Service {
    //    private FloppyWriter floppyWriter; // null
    private PortableHdWriter portableHdWriter;

//    public Service(FloppyWriter floppyWriter) {
//        this.floppyWriter = floppyWriter;
//    }

    public Service(PortableHdWriter portableHdWriter) {
        this.portableHdWriter = portableHdWriter;
    }

    public void write() {
//        floppyWriter.writeToFloppy(); // NPE
        portableHdWriter.writeToPortableHd();
    }
}
