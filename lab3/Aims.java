package lab3;

public class Aims {

    public static void main(String[] args) {
        Order order = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc();
        dvd1.setTitle("the lion king");
        dvd1.setCategory("animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("roger allers");
        dvd1.setLength(87);
        order.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc();
        dvd2.setTitle("stars wars");
        dvd2.setCategory("science fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("george lucas");
        dvd2.setLength(124);
        order.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc();
        dvd3.setTitle("aladdin");
        dvd3.setCategory("animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("john musker");
        dvd3.setLength(90);
        order.addDigitalVideoDisc(dvd3);

        System.out.println("Total Cost is:");
        System.out.println(order.totalCost());

    }
}
