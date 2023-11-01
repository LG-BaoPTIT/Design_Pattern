package Abstract_Factory_Method_Pattern;

public class HighEndDeviceFactory extends ElectronicDeviceAbstractFactory{
    @Override
    public Phone getPhone() {
        return new HighEndPhone();
    }

    @Override
    public Laptop getLaptop() {
        return new HighEndLaptop();
    }
}
