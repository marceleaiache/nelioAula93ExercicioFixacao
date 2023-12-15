package application;

import entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[9];

        System.out.println("How many rooms will be rented?");
        int qntRooms = sc.nextInt();
        sc.nextLine();

        if (qntRooms > 10) {
            System.out.println("The entered number exceeds the available quantity of rooms");
            System.out.println("We have a 10 room.");
            System.out.println("How many rooms will be rented?");
            qntRooms = sc.nextInt();
            sc.nextLine();
        }

        for (int i=0; i<qntRooms; i++) {
            System.out.printf("Rent #%d:%n", i+1);
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            vect[room] = new Rent(name, email, room);
        }

        System.out.println("Busy rooms: ");

        for (int i=0; i< vect.length; i++) {
            if(vect[i] != null) {
                System.out.printf("%d: %s, %s %n", vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
            }
        }

        sc.close();
    }
}
