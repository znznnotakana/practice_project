package method.q10;

import java.util.Arrays;
class EvenNumber{
    public static void main(String[] args){
        int[] num1 ={3,2,5,6,7,25,10,51,88,98};
        int result = checkEvenNumbers(num1);
        System.out.println(Arrays.toString(num1)+"には、偶数が"+result+"個あります。");
    }
    static int checkEvenNumbers(int[] a){
        int count =0;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2==0){
                count++;
            }
        }
        return count;
    }
}