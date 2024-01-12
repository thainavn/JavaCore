package InterfaceAbstractClass;

public class ChildEmirates extends ParentAirCraft {
    public static void main(String[] args) {
        ChildEmirates color = new ChildEmirates();
        color.bodyColor();
        color.safetyGuidelines();
        color.engine();
//        ParentAirCraft p = new ParentAirCraft();
    }

    @Override
    public void bodyColor() {
        System.out.println("Red color on the body");
    }
}
