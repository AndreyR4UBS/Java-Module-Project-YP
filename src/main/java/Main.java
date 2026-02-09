import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {System.out.println("Гонка! 24 часа Ле-Мана");}
        Scanner scanner= new Scanner(System.in);
        Race race = new Race();

        for (int i = 0; i < 3; i++) {
            String carName = readCarName(scanner);
            int carSpeed = readCarSpeed(scanner);

            Car car;
            car = new Car(carName, carSpeed);
            race.updateLeader(car);
        }
        System.out.println("Самая быстрая машина : " + race.getCurrentLeader().getName());
        scanner.close();
    }   private static String readCarName(Scanner scanner) {
        System.out.println("Введите название автомобиля:");
        return scanner.nextLine();
    }
    private static int readCarSpeed(Scanner scanner) {
        int carSpeed;
        while (true) {
            System.out.println("Введите скорость автомобиля (от 0 до 250 км/ч):");
            try {
                carSpeed = scanner.nextInt();
                if (carSpeed >= 0 && carSpeed <= 250) {
                    scanner.nextLine();
                    break;
                }         else {
                    System.out.println("Скорость должна быть (от 0 до 250 км/ч.):");
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите целое числовое значение.");
                scanner.nextLine(); // Очистить буфер сканера
            }
        }
        return carSpeed;
    }
}