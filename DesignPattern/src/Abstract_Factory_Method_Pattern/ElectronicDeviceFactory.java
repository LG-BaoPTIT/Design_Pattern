package Abstract_Factory_Method_Pattern;

public class ElectronicDeviceFactory {
    public static ElectronicDeviceAbstractFactory getFactory(Segment segment){
        switch (segment){
            case HIGH_END :
                return  new HighEndDeviceFactory();
            case MID_RANGE:
                return new MidRangeDeviceFactory();

            default:
                throw new UnsupportedOperationException("this device is unsupport");

        }
    }
}
