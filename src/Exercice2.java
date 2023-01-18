public class Exercice2 implements Runnable {

    public void run() {
        System.out.println("Je suis le thread d'id : " + Thread.currentThread().getId() + " je suis en cours d'exécution. Création en utilisant implements Runnable");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Création des threads par utilisant une interface exécutable ");

        Thread t1 = new Thread(new Exercice4());
        Thread t2 = new Thread(new Exercice4());
        Thread t3 = new Thread(new Exercice4());
        Thread t4 = new Thread(new Exercice4());
        Thread t5 = new Thread(new Exercice4());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
