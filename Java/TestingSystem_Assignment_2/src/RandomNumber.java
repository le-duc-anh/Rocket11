
import java.time.LocalDate;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author my pc
 */
public class RandomNumber {

    public static void main(String[] args) {
        // Q1
        Random random = new Random();
        int x = random.nextInt();
        System.out.println(x);

        // Q2
        float y = random.nextFloat();
        System.out.println(y);

        // Q3
        String[] names = {"Duc Anh", "Hoang Nam", "Nguyen Cuong"};
        int a = random.nextInt(names.length);
        System.out.println(names[a]);

        // Q4.
        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomInt = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
        System.out.println(randomDay);

        // Q5.
        int now = (int) LocalDate.now().toEpochDay();
        randomInt = now - random.nextInt(365);
        randomDay = LocalDate.ofEpochDay(randomInt);
        System.out.println(randomDay);

        // Q7.
        int z = random.nextInt(999 - 100 + 1) + 100;
        System.out.println(z);
    }
}
