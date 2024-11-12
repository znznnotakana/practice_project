package method.q08;

public class SumLoop {
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 100;
        int result = sumLoop(num1,num2);
        System.out.println("最小値"+ num1);
        System.out.println("最大値"+ num2);
        System.out.println("加算結果"+ result);
    }
    static int sumLoop(int a,int b){
        int sum =0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }
}
