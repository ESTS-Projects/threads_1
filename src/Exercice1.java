public class Exercice1 extends Thread {

    public void run() {
        System.out.println("Je suis le thread d'id : " + this.getId() + ", je suis en cours d'exécution. Création en étendant la classe Thread");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Création des threads par Héritage de la classe Thread");

        Exercice1 t1 = new Exercice1();
        Exercice1 t2 = new Exercice1();
        Exercice1 t3 = new Exercice1();
        Exercice1 t4 = new Exercice1();
        Exercice1 t5 = new Exercice1();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
