public class Main {
    public static void main(String[] args) {
        // Instancia de Airplane
        Airplane Avion = new Airplane();
        Avion.takeOff();
        Avion.fly();
        Avion.land();

        // Instancia de Bird
        Bird Golondrina = new Bird();
        Golondrina.takeOff();
        Golondrina.fly();
        Golondrina.land();
        Golondrina.eat();
        Golondrina.buildNest();
        Golondrina.layEggs();

        // Instancia de Superman
        Superman Yomero = new Superman();
        Yomero.takeOff();
        Yomero.fly();
        Yomero.land();
        Yomero.eat();
        Yomero.leapBuilding();
        Yomero.stopBullet();
    }
}
