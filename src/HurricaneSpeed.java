import java.util.Scanner;

public class HurricaneSpeed {
    public static void main(String[] args) {
        //Hurricane Category                                  Speed
        //
        //     Category 1                                            74 - 95 mph
        //
        //     Category 2                                            96 - 110 mph
        //
        //     Category 3                                            111 - 129 mph
        //
        //     Category 4                                            130 - 156 mph
        //
        //     Category 5                                            157 or higher

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Hurricane speed:");
        int speed = input.nextInt();

        if (speed >= 74 && speed <= 95) {
            System.out.println("Category 1");

        } else if (speed >= 96 && speed <= 110) {
            System.out.println("Catalog 2");

        }else if (speed >= 111 && speed <= 129) {
            System.out.println("Catalog 3");

        }else if (speed >= 130 && speed <= 156) {
            System.out.println("Catalog 4");

        } else if (speed >= 157 ) {

            System.out.println("Catalog 5");
        }
    }
}