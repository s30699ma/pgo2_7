//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(5);
        car1.start();
        car1.stop();
        System.out.println("Liczba miejsc: " + car1.getNumberOfSeats());

        Car car2 = new Car(2);
        car2.start();
        car2.stop();
        System.out.println("Liczba miejsc: " + car2.getNumberOfSeats());

    }
}