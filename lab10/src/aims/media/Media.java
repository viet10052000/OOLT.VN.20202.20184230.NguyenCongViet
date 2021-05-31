package aims.media;

public abstract class Media {
  private int id;
  private String title;
  private String category;
  private float cost;

  public Media() {
  }

  public Media(int id) {
    this.id = id;
  }

  public Media(String title) {
    this.title = title;
  }

  public Media(String title, String category) {
    this.title = title;
    this.category = category;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public float getCost() {
    return cost;
  }

  public void setCost(float cost) {
    this.cost = cost;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Media) {
      if (this.getTitle().equals(((Media) obj).getTitle())) {
        if (this.getCost() == ((Media) obj).getCost()) {
          return true;
        }
      }
    }
    return false;
  }
}
