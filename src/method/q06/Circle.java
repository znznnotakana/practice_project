package method.q06;

public class Circle {
    public static void main(String[] args){
        double num1 = 5.0;
        double pie = 3.14;
        double result = getCircleArea(num1,pie);
        System.out.println("半径: "+ num1);
        System.out.println("円の面積: "+ result);
    }
    static double getCircleArea(double a,double b){
        return a * a * b;
    }
}
