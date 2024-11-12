package basic.q07;

public class MultiplicationTable {
	    public static void main(String[] args){
	        int num =1;
	        int sum =1;
	        for(int i = 1; i<10; i++){
	            for(int j = 1; j < 10; j++){
	                sum=i*j;
	                System.out.print(" "+sum+"\t");
	            }
	            System.out.println();
	        }
	    }

}
