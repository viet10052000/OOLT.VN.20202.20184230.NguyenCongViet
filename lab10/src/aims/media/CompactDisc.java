package aims.media;

import aims.PlayerException;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable, Comparable {
  private String artist;
  private int length;
  private ArrayList<Track> tracks = new ArrayList<Track>();

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void addTrack(Track track) {
    if (tracks.contains(track)) {
      System.out.println("Track is already in the list of tracks!");
      return;
    }
    tracks.add(track);
    System.out.println("Add track success!");
  }

  public void removeTrack(Track track) {
    if (tracks.remove(track)) {
      System.out.println("Remove track success!");
      return;
    }
    System.out.println("Track is not in the list of tracks!");
  }

  public int getLength() {
    int length = 0;
    for (int i = 0; i < tracks.size(); i++) {
      length += tracks.get(i).getLength();
    }
    return length;
  }

  @Override
  public void play() throws PlayerException {
    if (this.getLength() <= 0) {
      System.err.println("ERROR: CD length is 0");
      throw new PlayerException();
    }

    System.out.println("Playing " + this.getArtist() + "'s disc");
    System.out.println("Playing CD: " + this.getTitle());
    System.out.println("CD length: " + this.getLength());

    for (int i = 0; i < tracks.size(); i++) {
      try {
        tracks.get(i).play();
      } catch (PlayerException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public int compareTo(Object o) {
    CompactDisc cd = (CompactDisc) o;

    if (tracks.size() > cd.tracks.size()) return 1;
    else if (tracks.size() < cd.tracks.size()) return -1;
    else {
      if (this.getLength() > cd.getLength()) return 1;
      else if (this.getLength() < cd.getLength()) return -1;
      return 0;
    }
//    return this.getTitle().compareTo(cd.getTitle());
  }
}
