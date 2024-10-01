public class Airplane extends Vehicle implements Flyer {

    @Override
    public void takeOff() {
        System.out.println("Airplane taking off");
    }

    @Override
    public void land() {
        System.out.println("Airplane landing");
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }
}
