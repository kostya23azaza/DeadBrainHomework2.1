package Homework;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random random = new Random();
        Actions[] actions = new Actions[3];
        Barrier[] barriers = new Barrier[2];
        actions[0] = new Cat("Мурзик", random.nextInt(10), random.nextInt(10));
        actions[1] = new Robot("Bender", random.nextInt(10), random.nextInt(10));
        actions[2] = new Human("Геннадий", random.nextInt(10), random.nextInt(10));
        barriers[0] = new Wall(random.nextInt(10));
        barriers[1] = new Road(random.nextInt(10));
        boolean result = true;
        for (int i = 0; i <actions.length ; i++) {
            for (int j = 0; j <barriers.length ; j++) {
             result= barriers[j].moving(actions[i]);
                if (result == false) {
                    break;
                }
               if (result==true) {
                   System.out.println("Успех!");
               }
            }
        }
    }
}
