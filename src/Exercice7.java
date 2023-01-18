public class Exercice7 extends Thread {

  int max = 0;
  String name = "";

  Exercice7(String name, int max) {
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

    System.out.println("*** " + this.name + " a fini de compter jusqu'à " + this.max + " en position " + this.getId());
  }

  public static void main(String args[]) {
    Exercice7 c1 = new Exercice7("Toto", 10);
    Exercice7 c2 = new Exercice7("Mike", 10);
    Exercice7 c3 = new Exercice7("Rudy", 10);
    Exercice7 c4 = new Exercice7("Alphonse", 10);

    c1.start();
    c2.start();
    c3.start();
    c4.start();
  }
}