package lab6.hust.soict.hedspi.Aim;



import lab6.hust.soict.hedspi.Aim.Disc.DigitalVideoDisc;
import lab6.hust.soict.hedspi.Aim.Media.Media;
import lab6.hust.soict.hedspi.Aim.Order.Order;

import java.util.*;

public class DiskTest {
    
    public static Order createOrder() {
        if (Order.checkNumberOfOrder()) {
            return new Order();
        } else {
            System.out.println("Cannot create more order...");
            return null;
        }
    }
    public static void main(String[] args) {
        Order order = createOrder();
        ArrayList <Media> itemsOrdered = order.getItemsOrdered();
        ArrayList <Media> items = new ArrayList<Media>();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation", "Roger Allers", 11, 77.9f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars", "Science Fiction", "George Lucas", 22, 88.7f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"The Dark Knight", "Action Movie", "Christopher Nolan", 33, 99.4f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4,"Terminator 2: Judgment Day", "Action Movie", "James Cameron", 44, 111.9f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc(5,"Die Hard", "Action Movie", "John McTiernan", 55, 222.3f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc(6,"Inception", "Action Movie", "Christopher Nolan", 66, 33.2f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc(7,"Conan", "Action Movie", "Christopher Nolan", 80, 40.7f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc(8,"One Piece", "Action Movie", "Christopher Nolan", 100, 70.8f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc(9,"Harry Potter", "Action Movie", "Christopher Nolan", 76, 30.5f);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc(10,"Dragon", "Action Movie", "Christopher Nolan", 132, 323.9f);
        items.add(dvd6);
        items.add(dvd7);
        items.add(dvd8);
        items.add(dvd9);
        items.add(dvd10);
        order.addItem(dvd1);
        order.addItem(dvd2, dvd3);
        order.addItem(dvd4, dvd5);
        order.addItem(items);
       
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int select;
        do {
            System.out.println("1. Hi???n th??? danh s??ch ????n h??ng."); 
            System.out.println("2. T??m ki???m title.");   
            System.out.println("3. Tho??t."); 
            System.out.print("B???n ch???n: "); 
            select=sc.nextInt();
            sc.nextLine();
            switch(select) {
                case 1:
                    order.show();
                    break;
                case 2:
                    int count = 0;
                    System.out.print("Nh???p ti??u ????? mu???n t??m: "); 
                    String td = sc.nextLine();
                    System.out.println("Nh???ng dvd ch???a ti??u ????? " + td + " : ");
                    for(int i = 0; i < itemsOrdered.size() ; i++){
                        if(itemsOrdered.get(i).search(td)){
                            System.out.println(itemsOrdered.get(i).showInfo());
                            count++;
                        }
                    }
                    if(count == 0) System.out.println("Kh??ng c?? dvd n??o ch???a ti??u ????? " + td);
                    break;
                case 3:
                    System.out.println("Xin ch??o t???m bi???t!");
                    check = false;
                    break;
                default:
                    System.out.println("Nh???p sai, h??y nh???p l???i");
                    break;
            }
        } while(check);
    }
}
