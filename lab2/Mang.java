import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        int n,sum = 0;
        double trungbinh = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("nhap mang:");
        for(int i = 0 ; i < n;i++){
            a[i] = scanner.nextInt();
            sum += a[i];

        }
        for(int i = 0;i < n - 1;i++){
            if(a[i] >= a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print(a[i] + "\t");
        }
        trungbinh = sum/n;
        System.out.println();
        System.out.println("tong : " + sum);
        System.out.println("trung binh:" + trungbinh);
         
    }
    
}
