import java.util. Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "Tai";
        int age;
        int temperature;


        System.out.println("Enter age");
        age = scanner.nextInt();

        System.out.println("Enter temperature");
        temperature = scanner.nextInt();

        if ((temperature > 30 || temperature < -20) && (age > 20 && age < 45)) {
            System.out.println(name + " Не выходит гулять");

        } else if ((temperature < 0 || temperature > 28) && (age > 0 && age < 20)) {
            System.out.println(name + " Не выходит гулять");
        } else if ((temperature > 25 || temperature < -10) && (age > 45)) {
            System.out.println(name + " Не выходит гулять");
        } else {
            System.out.println(name + " Отправляется в гости к другу");
        }
    }
}
