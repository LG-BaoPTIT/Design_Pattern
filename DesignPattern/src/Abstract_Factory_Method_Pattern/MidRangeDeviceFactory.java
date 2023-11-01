package Abstract_Factory_Method_Pattern;

public class MidRangeDeviceFactory extends ElectronicDeviceAbstractFactory{
    @Override
    public Phone getPhone() {
        return new MidRangePhone();
    }

    @Override
    public Laptop getLaptop() {
        return new MidRangeLaptop();
    }
}
