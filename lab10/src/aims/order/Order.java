package aims.order;

import aims.media.Media;

import java.util.ArrayList;
import java.util.Date;

public class Order {
  public static final int MAX_NUMBERS_ORDERED = 10;
  public static final int MAX_LIMITED_ORDERS = 5;
  private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
  private static int nbOrders;
  private Date dateOrdered;

  public Order() {
    if (nbOrders == MAX_LIMITED_ORDERS) {
      System.out.println("Max limited orders in day");
      return;
    }
    this.setDateOrdered();
    nbOrders++;
  }

  public Date getDateOrdered() {
    return dateOrdered;
  }

  public void setDateOrdered() {
    dateOrdered = new Date();
    ;
  }

  public void addMedia(Media media) {
    if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
      itemsOrdered.add(media);
      System.out.println("The media has been added!");
    } else {
      System.out.println("The order is almost full!");
    }
  }

  public void removeMedia(Media media) {
    if (itemsOrdered.remove(media)) {
      System.out.println("The disc has been removed!");
    } else {
      System.out.println("Media is not in order!");
    }
  }

  public void removeMedia(int id) {
    for (int i = 0; i < itemsOrdered.size(); i++) {
      if (itemsOrdered.get(i).getId() == id) {
        itemsOrdered.remove(i);
        System.out.println("The disc has been removed!");
        return;
      }
    }
    System.out.println("Media is not in order!");
  }

  public float totalCost() {
    float total = 0;

    for (int i = 0; i < itemsOrdered.size(); i++) {
      total += itemsOrdered.get(i).getCost();
    }
    return total;
  }

  public void printOrder() {
    System.out.println("*****************Order******************");
    System.out.println("Date: " + dateOrdered);
    System.out.println("Ordered items:");
    for (int i = 0; i < itemsOrdered.size(); i++) {
      System.out.println(i + 1
              + ". ID - " + itemsOrdered.get(i).getId()
              + " - " + itemsOrdered.get(i).getTitle()
              + " - " + itemsOrdered.get(i).getCategory()
              + ": " + itemsOrdered.get(i).getCost() + "$"
      );
    }
    System.out.println("Total cost: " + this.totalCost());
    System.out.println("****************************************");
  }

  public Media getALuckyItem() {
    int randomDvd = (int) (itemsOrdered.size() * Math.random());
    itemsOrdered.get(randomDvd).setCost(0);
    return itemsOrdered.get(randomDvd);
  }
}
