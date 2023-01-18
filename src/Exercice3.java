public class Exercice3 extends Thread {

    public static void main(String[] args) throws Exception {
        Exercice3 t = new Exercice3();
        System.out.println(t.getName());

        t.setName("New Name");
        System.out.println(t.getName());
        
        System.out.println(t.getPriority());
        t.setPriority(MAX_PRIORITY);
        System.out.println(t.getPriority());
    }
}
