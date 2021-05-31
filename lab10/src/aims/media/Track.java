package aims.media;

import aims.PlayerException;

public class Track implements Playable, Comparable {
  private String title;
  private int length;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
      System.err.println("ERROR: Track length is 0");
      throw new PlayerException();
    }
    System.out.println("Playing track: " + this.getTitle());
    System.out.println("Track length: " + this.getLength());
  }

  @Override
  public int compareTo(Object o) {
    Track track = (Track) o;

    return this.getTitle().compareTo(track.getTitle());
  }
}
