import java.util.Scanner;

public class Ellipse {
    public static void main(String[] args) {

        System.out.println("According to the formula x^2/a^2 + y^2/b^2 = 1\nFor calculate x - press 1\nFor calculate y - press 2");
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        System.out.println("Please enter major and minor axis - a and b");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if (a < b) {
            System.out.println("Invalid value: Major axis a >= minor axis b");
            System.exit(1);
        }

        Curve ellipse = new Curve();

        switch (choose) {
            case 1:
                System.out.println("Input y...");
                ellipse.setY(scan.nextInt());
                System.out.println("x = " + Math.sqrt(Math.pow(a, 2) -
                        Math.pow(ellipse.getY(), 2) * Math.pow(a, 2) / Math.pow(b, 2)));
                System.out.println("y = " + ellipse.getY());
                break;
            case 2:
                System.out.println("Input x...");
                ellipse.setX(scan.nextInt());
                System.out.println("x = " + ellipse.getX());
                System.out.println("y = " + Math.sqrt(Math.pow(b, 2) -
                        Math.pow(ellipse.getX(), 2) * Math.pow(b, 2) / Math.pow(a, 2)));
                break;
            default:
                System.out.println("Invalid choose");
                break;
        }

    }
}
