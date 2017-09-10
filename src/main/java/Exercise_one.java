import java.util.Scanner;

public class Exercise_one {

    public static void main(String[] args) {

        System.out.println("According to the formula x = 1 / y\nFor calculate y - press 1\nFor calculate x - press 2");
        Scanner scan = new Scanner(System.in);
        Hyperbola hyperbola = new Hyperbola();
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Input x...");
                hyperbola.setX(scan.nextInt());
                System.out.println("x = " + hyperbola.getX());
                System.out.println("y = " + hyperbola.calculate(hyperbola.getX()));
                break;
            case 2:
                System.out.println("Input y...");
                hyperbola.setY(scan.nextInt());
                System.out.println("y = " + hyperbola.getY());
                System.out.println("x = " + hyperbola.calculate(hyperbola.getY()));
                break;
            default:
                System.out.println("Invalid choose");
                break;
        }

    }

}
