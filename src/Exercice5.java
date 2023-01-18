public class Exercice5 implements Runnable {
  public void run() {
    for (char a = 'A'; a <= 'Z'; a++) {
      System.out.print(a);

      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
      }
    }

    System.out.print("\n");
  }

  public static void main(String args[]) {
    Exercice5 A1 = new Exercice5();
    Thread T1 = new Thread(A1);
    Exercice5 A2 = new Exercice5();
    Thread T2 = new Thread(A2);

    T1.start();
    T2.start();
  }
}