package prática10;

public class Maintempo {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(); // Tempo padrão 0:0:0
        Tempo t2 = new Tempo(10); // 10:0:0
        Tempo t3 = new Tempo(14, 30); // 14:30:0
        Tempo t4 = new Tempo(9, 45, 15); // 9:45:15

        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);
        System.out.println("t4: " + t4);

        // Definir tempo para t1
        t1.setTime(5, 25, 35);
        System.out.println("t1: " + t1);
    }
}