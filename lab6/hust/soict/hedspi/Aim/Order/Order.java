package lab6.hust.soict.hedspi.Aim.Order;
import Media.*;
import lab6.hust.soict.hedspi.Aim.Media.Media;

import java.util.ArrayList;


public class Order {

    public static final int MAX_NUMBERS_ORDERED_ITEMS = 10;
    public static final int MAX_LIMITED_ORDERED = 5;
    public static int nbOrder = 0;
    private int luckyItem = 0;
    private ArrayList <Media> itemsOrdered = new ArrayList <Media> ();

    public int getLuckyItem() {
        return luckyItem;
    }

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public static boolean checkNumberOfOrder() {
        return (nbOrder < 5);
    }

    public Order(){
        nbOrder++;
    }

    public void verifyOrderedItem() {
        int dem = itemsOrdered.size();
        if (dem < MAX_NUMBERS_ORDERED_ITEMS - 1 ) {
            System.out.println("Đã được thêm vào Order");
        }
        if (dem == MAX_NUMBERS_ORDERED_ITEMS - 1 ) {
            System.out.println("Đã được thêm vào Order,Order đã đầy");
        }
        if (dem > MAX_NUMBERS_ORDERED_ITEMS - 1 ) {
            System.out.println("Đã đầy, không thể thêm");
        }
    }

    public void addItem(Media item){
        verifyOrderedItem();
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED_ITEMS)
            itemsOrdered.add(item);
    }

    public void addItem(Media item1, Media item2){
        addItem(item1);
        addItem(item2);
    }

    public void addItem(ArrayList<Media> items ){
        for(int i=0; i < items.size() ; i++){
            addItem(items.get(i));
        }
    }

    public void removeItem(Media item ){
        if(itemsOrdered.contains(item) == true){
            itemsOrdered.remove(item);
            System.out.println("removed from the list");
        } else System.out.println("Does not exist");
    }
    
     public void removeItem(ArrayList<Media> items ){
       items.clear();
    }

    public void removeItembyid(int id){
        int count = 0;
        for(int i=0 ; i< itemsOrdered.size(); i++){
            if(itemsOrdered.get(i).getId() == id){
                itemsOrdered.remove(i);
                count++;
                System.out.println("Deleted");
                if(i == getLuckyItem()){
                    randomLuckyItem();
                }
            }
        }
        if(count==0){ System.out.println("The searching id does not exist");}
    }
      
    public void show() {
        System.out.println("------------------------------------");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(i + 1 + "." + itemsOrdered.get(i).showInfo());
        }
        System.out.println("------------------------------------");
        System.out.println("Total cost: " + totalCost());
        System.out.println("Lucky Item gets free: \n" + itemsOrdered.get(luckyItem).showInfo());
    }
    
    public float totalCost() {
        float tong = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            tong += itemsOrdered.get(i).getCost();
        }
        tong -= itemsOrdered.get(luckyItem).getCost();
        return tong;
    }
        
    public void randomLuckyItem() {
        int range = 10;
        int max = 10;
        int min = itemsOrdered.size();
        this.luckyItem = (int) (Math.random() * range);
        if(luckyItem >= itemsOrdered.size()) luckyItem -= (max - min);
    }
}
