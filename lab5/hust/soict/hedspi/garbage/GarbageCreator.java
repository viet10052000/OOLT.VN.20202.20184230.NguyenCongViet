package lab5.hust.soict.hedspi.garbage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\OOPthuchanh\\src\\lab5\\hust\\soict\\hedspi\\garbage\\text.txt");
//        Scanner sc = new Scanner(reader);
//        String s = "";
//        while (sc.hasNext() == true){
//            s += sc.next;
//        }
        int r;
        while ((r = reader.read()) != -1) {
            char ch = (char) r;
            System.out.print(ch);
        }
//        System.out.println(s);
//        sc.close();

    }
}
