package Singleton_Design_pattern;

public class LazyInitialization {
    private static LazyInitialization INSTANCE;
    private String name;
    private LazyInitialization(){

    }
    public static LazyInitialization getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyInitialization();
        }
        return INSTANCE;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
