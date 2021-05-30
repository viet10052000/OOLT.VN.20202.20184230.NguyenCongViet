package lab5.hust.soict.hedspi.garbage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class NoGarbage {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("C:\\Users\\ASUS\\Desktop\\OOPthuchanh\\src\\lab5\\hust\\soict\\hedspi\\garbage\\text.txt");
        Scanner sc = new Scanner(fr);
        StringBuffer line = new StringBuffer();
        while(sc.hasNext()){
            line.append(sc.nextLine());
            line.append("\n");
        }
        System.out.println(line);
        // Close the file.
        sc.close();
    }

}
