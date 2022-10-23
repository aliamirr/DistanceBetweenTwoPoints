import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pointA, pointB, distance;
        System.out.println("Enter point A: ");
        Scanner imp = new Scanner(System.in);
        pointA = imp.nextDouble();
        System.out.println("Enter point B: ");
        pointB = imp.nextDouble();
        distance = pointB - pointA;
        System.out.println("The distance between two point A and point B is: " + distance);
    }
}