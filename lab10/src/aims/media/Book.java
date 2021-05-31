package aims.media;

import java.util.*;

public class Book extends Media implements Comparable {
  private List<String> authors = new ArrayList<String>();
  private String content;
  private List<String> contentTokens;
  private Map<String, Integer> wordFrequency = new TreeMap<String, Integer>();

  public Book() {
  }

  public Book(int id) {
    super(id);
  }

  public Book(String title) {
    super(title);
  }

  public Book(String title, String category) {
    super(title, category);
  }

  public Book(String title, String category, List<String> authors) {
    super(title, category);
    this.authors = authors;
  }

  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
    processContent();
  }

  public void addAuthor(String authorName) {
    if (authors.contains(authorName)) {
      System.out.println("This author is already exists!");
    } else {
      authors.add(authorName);
      System.out.println("Add success!");
    }
  }

  public void removeAuthor(String authorName) {
    if (authors.remove(authorName)) {
      System.out.println("Remove success!");
    } else {
      System.out.println("This author is not exists!");
    }
  }

  public void processContent() {
    contentTokens = Arrays.asList(content.split(" "));
    Collections.sort(contentTokens);

    System.out.println(contentTokens);

    for (String contentToken : contentTokens) {
      if (wordFrequency.containsKey(contentToken)) {
        wordFrequency.put(contentToken, wordFrequency.get(contentToken) + 1);
      } else {
        wordFrequency.put(contentToken, 1);
      }
    }

    for (Map.Entry entry : wordFrequency.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

  @Override
  public int compareTo(Object o) {
    Book book = (Book) o;

    return this.getTitle().compareTo(book.getTitle());
  }
}
