package basic.q06;

public class ShowSeasons {
    public static void main(String[] args){
        int num =15;
        String season = "" ;
        switch(num){
            case 1:
            case 2:
            case 12:
                season = "冬";
                System.out.println(num+"月は"+season+"です");
                break;
            case 3:
            case 4:
            case 5:
                season = "春";
                System.out.println(num+"月は"+season+"です");
                break;
            case 6:
            case 7:
            case 8:
                season ="夏";
                System.out.println(num+"月は"+season+"です");
                break;
            case 9:
            case 10:
            case 11:
                season = "秋";
                System.out.println(num+"月は"+season+"です");
                break;
            default:
                System.out.println(num+"月は存在しない月です");
        }
        
    }
}
