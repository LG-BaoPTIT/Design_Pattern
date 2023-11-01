package Factory_Method_Design_pattern;

public class CandyFactory {
    public static Candy getCandy(CandyType candyType) {
        switch (candyType){
            case HARD :
                return new HardCandy();
            case MINTY:
                return new MintyCandy();
            default:
                return null;
        }


    }
}
