package lab3;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemOrdered[qtyOrdered] = disc;
        qtyOrdered ++;
    }
    public float totalCost() {
        float f = 0;
        for (int i = 0; i < qtyOrdered; i++) {
			f = f + itemOrdered[i].getCost();
		}

        return f;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if ( itemOrdered[i] == disc ) {
                itemOrdered[i] = itemOrdered[qtyOrdered-1];
                itemOrdered[qtyOrdered] = null;
                qtyOrdered--;
            }
        }
    }
    public void getOrder() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemOrdered[i].getTitle());
        }
    }
}
