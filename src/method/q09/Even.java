package method.q09;

public class Even {
    public static void main(String[] args){
        int num1 = 10;
        boolean result = checkEven(num1);
        if(result){
            System.out.println(num1+"は偶数です。");
        }
        else{
            System.out.println(num1+"は奇数です。");
        }
    }
    static boolean checkEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
