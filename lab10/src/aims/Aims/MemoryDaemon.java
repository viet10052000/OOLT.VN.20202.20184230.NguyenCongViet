package aims.Aims;

public class MemoryDaemon implements java.lang.Runnable {
  private long memoryUsed;

  @Override
  public void run() {
    Runtime rt = Runtime.getRuntime();
    long used;

    while (true) {
      used = rt.totalMemory() - rt.freeMemory();
      if (used != memoryUsed) {
        System.out.println("\tMemory used = " + used);
        memoryUsed = used;
      }
    }
  }
}
