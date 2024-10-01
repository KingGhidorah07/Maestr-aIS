public class Superman extends Kryptonian implements Flyer {

    @Override
    public void takeOff() {
        System.out.println("Superman taking off");
    }

    @Override
    public void land() {
        System.out.println("Superman landing");
    }

    @Override
    public void fly() {
        System.out.println("Superman flying");
    }

    @Override
    void eat() {
        System.out.println("Superman eating");
    }

    public void leapBuilding() {
        System.out.println("Superman leaping a building");
    }

    public void stopBullet() {
        System.out.println("Superman stopping a bullet");
    }
}
