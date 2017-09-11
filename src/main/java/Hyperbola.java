import java.util.Scanner;

public class Hyperbola {

    public static void main(String[] args) {

        System.out.println("According to the formula x = 1 / y\nFor calculate y - press 1\nFor calculate x - press 2");
        Scanner scan = new Scanner(System.in);
        Curve hyperbola = new Curve();
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Input x...");
                hyperbola.setX(scan.nextInt());
                System.out.println("x = " + hyperbola.getX());
                System.out.println("y = " + 1 / hyperbola.getX());
                break;
            case 2:
                System.out.println("Input y...");
                hyperbola.setY(scan.nextInt());
                System.out.println("y = " + hyperbola.getY());
                System.out.println("x = " + 1 / hyperbola.getY());
                break;
            default:
                System.out.println("Invalid choose");
                break;
        }

    }

}
