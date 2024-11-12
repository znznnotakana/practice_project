package method.q07;

public class SumNumbers2 {
    public static void main(String[] args){
        int num1 = 5;
        double num2 = 3.3;
        int result = calculateSum(num1,num2);
        System.out.println("第一引数: "+ num1);
        System.out.println("第二引数: "+ num2);
        System.out.println("加算結果: "+result);
    }
    static int calculateSum(int a,double b){
        int c  = (int) b;
        return a + c;
    }
}
