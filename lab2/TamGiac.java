import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chieu cao tam giac:");
        int num = scanner.nextInt();

        for (int r = 1; r <= num; r++) {
			for (int sp = num - r; sp > 0; sp--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			for (int k = 2; k <= r; k++) {
				System.out.print("*");
			}
			System.out.println();
        }
    }
    
}
