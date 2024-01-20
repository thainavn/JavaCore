package InterfaceAbstractClass;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic {
    public static void main(String[] args) {
        CentralTraffic a = new AustralianTraffic();
        a.redStop();
        a.greenGo();
        a.yellowSlow();
        AustralianTraffic at = new AustralianTraffic();
        at.walkOnSymbol();
        ContinentTraffic ct = new AustralianTraffic();

    }

    public void walkOnSymbol() {
        System.out.println("walking");
    }

    @Override
    public void greenGo() {
        System.out.println("green go implementation");
    }

    @Override
    public void redStop() {
        System.out.println("red stop implementation");
    }

    @Override
    public void yellowSlow() {
        System.out.println("yellow slow implementation");
    }


    @Override
    public void TrainSymbol() {
        System.out.println("yellow slow implementation");
    }
}
