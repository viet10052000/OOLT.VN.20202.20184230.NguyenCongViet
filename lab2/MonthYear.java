import java.util.Scanner;

public class MonthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year:");
        int year = scanner.nextInt();
        int month;
        while(year < 0){
            System.out.println("nhap lai:");
            year = scanner.nextInt();

        };

        System.out.println("thang     " + "t1\t " + "t2\t " + "t3\t " + "t4\t " + "t5\t " + "t6\t " + "t7\t " + "t8\t " + "t9\t "
         + "t10\t " + "t11\t " + "t12\t " );
        System.out.print("thang     ");
         for(int i = 1; i < 13;i++){
             System.out.print(i + "\t ");
         }
        System.out.println();
        System.out.print("ngay     ");
         for(int i = 1;i<13;i++){
             if(i == 1||i==3||i==5||i==7||i==9||i==11){
                 System.out.print("30\t ");
             }else if(i == 2){
                 if((year%100 != 0 && year%4 == 0)||(year%400==0)){
                     System.out.print("29\t ");
                 }else{
                     System.out.print("28\t ");
                 }
             }else{
                 System.out.print("31\t ");
             }
         }

    }
    
}
