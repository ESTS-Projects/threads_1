public class Exercice6 extends Thread {

  int max = 0;
  String name = "";

  Exercice6(String name, int max) {
    this.max = max;
    this.name = name;
  }

  public void run() {
    for (int i = 0; i < this.max; i++) {
      System.out.println(this.name + " : " + (i + 1));

      try {
        int min = 0;
        int max = 5000;
        int delay = (int) (Math.random() * max) + min;

        Thread.sleep(delay);
      } catch (InterruptedException e) {
      }
    }

    System.out.println("*** " + this.name + " a fini de compter jusqu'à " + this.max);
  }

  public static void main(String args[]) {
    Exercice6 c1 = new Exercice6("Toto", 10);
    Exercice6 c2 = new Exercice6("Mike", 10);
    Exercice6 c3 = new Exercice6("Rudy", 10);
    Exercice6 c4 = new Exercice6("Alphonse", 10);

    c1.start();
    c2.start();
    c3.start();
    c4.start();
  }
}