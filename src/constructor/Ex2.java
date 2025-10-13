package constructor;

/* 
    private constructor 
    cannot accessed outside the class
    commonly used in singleton design pattern
*/
class Singleton {
    String name;
    static Singleton instance;

    private Singleton() {
    }; // private constructor

    public static Singleton getObject() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Ex2 {
    public static void main(String[] args) {
        Singleton s = Singleton.getObject();
        Singleton s1 = Singleton.getObject();
        s.name = "Govind";
        s1.name = "Ram";
        System.out.println(s.getName() + "   " + s1.getName());
    }

}
