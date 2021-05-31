package aims.media;

import aims.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable, Comparable {
  private String director;
  private int length;

  public DigitalVideoDisc() {
  }

  public DigitalVideoDisc(int id) {
    super(id);
  }

  public DigitalVideoDisc(String title) {
    super(title);
  }

  public DigitalVideoDisc(String title, String category) {
    super(title, category);
  }

  public DigitalVideoDisc(String title, String category, String director, int length) {
    super(title, category);
    this.director = director;
    this.length = length;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  @Override
  public void play() throws PlayerException {
    if (this.getLength() <= 0) {
      System.err.println("ERROR: DVD length is 0");
      throw new PlayerException();
    }
    System.out.println("Playing DVD: " + this.getTitle());
    System.out.println("DVD length: " + this.getLength());
  }

  @Override
  public int compareTo(Object o) {
    DigitalVideoDisc dvd = (DigitalVideoDisc) o;

//    return this.getTitle().compareTo(dvd.getTitle());
    if (this.getCost() > dvd.getCost()) return 1;
    else if (this.getCost() < dvd.getCost()) return -1;
    return 0;
  }
}
