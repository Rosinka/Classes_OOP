import java.util.Scanner;

public class Parabola {
    public static void main(String[] args) {

        System.out.println("According to the formula y = a*x^2 + b*x + c\nFor calculate y - press 1\nFor calculate x - press 2");
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        System.out.println("Please enter a, b and c");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        Curve parabola = new Curve();

        switch (choose) {
            case 1:
                System.out.println("Input x...");
                parabola.setX(scan.nextInt());
                System.out.println("x = " + parabola.getX());
                System.out.println("y = " + a * Math.pow(parabola.getX(), 2) + b * parabola.getX() + c);
                break;
            case 2:
                System.out.println("Input y...");
                parabola.setY(scan.nextInt());
                System.out.println("x = " + Math.sqrt((parabola.getY()) - b * parabola.getX() - c) / a);
                System.out.println("y = " + parabola.getY());
                break;
            default:
                System.out.println("Invalid choose");
                break;
        }

    }
}
