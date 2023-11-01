import Abstract_Factory_Method_Pattern.*;



public class Main {
    public static void main(String[] args) {
//        EagerInitialization eager1 = EagerInitialization.getInstance();
//        eager1.setName("LGB");
//        System.out.println(eager1.getName());
//
//        EagerInitialization eager2 = EagerInitialization.getInstance();
//
//       System.out.println(eager2.getName());

//        LazyInitialization lazy1 = LazyInitialization.getInstance();
//        lazy1.setName("hihi");
//        System.out.println(lazy1.getName());
//
//        LazyInitialization lazy2 = LazyInitialization.getInstance();
//        lazy2.setName("hihihi");
//        System.out.println(lazy2.getName());
//        System.out.println(lazy1.getName());

//        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
//        System.out.println(hardCandy.getCandyName());
//        System.out.println("++++++++++++++++++++++");
//        Candy mintyCandy = CandyFactory.getCandy(CandyType.MINTY);
//        System.out.println(mintyCandy.getCandyName());

        ElectronicDeviceAbstractFactory highEndFactory = ElectronicDeviceFactory.getFactory(Segment.HIGH_END);

        Laptop highLaptop = highEndFactory.getLaptop();
        Phone highPhone = highEndFactory.getPhone();

        System.out.println(highLaptop.getSegment());
        System.out.println(highPhone.getSegment());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        ElectronicDeviceAbstractFactory midRangeFactory = ElectronicDeviceFactory.getFactory(Segment.MID_RANGE);

        Laptop midLaptop = midRangeFactory.getLaptop();
        Phone midPhone = midRangeFactory.getPhone();

        System.out.println(midLaptop.getSegment());
        System.out.println(midPhone.getSegment());




    }
}