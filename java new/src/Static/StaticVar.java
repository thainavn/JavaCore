package Static;

public class StaticVar {
    String name;
    String address;
    static String city;
    static int i;

    static {
        city = "Bangalore";
        i = 0;
    }

    ;

    StaticVar(String name, String address) {
        this.name = name;
        this.address = address;
        i++;
        System.out.println(i);
    }

    public void getAddress() {
        System.out.println(address + " " + city);
    }

    public static void getCity() {
        System.out.println(city);
    }

    public static void main(String[] args) {
        StaticVar obj1 = new StaticVar("Bob", "Thallium");
        StaticVar obj2 = new StaticVar("Thai", "Dinh Cong");
        StaticVar obj3 = new StaticVar("Thai", "Dinh Cong");
        obj1.getAddress();
        obj2.getAddress();
        StaticVar.getCity();
        StaticVar.i = 4;
        System.out.println(StaticVar.i);
        obj1.address = "XYZ";
    }
}
