/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearlists;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Sean
 */
public class LinkedListPlay {

    public static void main(String[] args) {
        LinkedList animals = createAnimalList();
        displayAnimals("\nThe animal names ...", animals);

        LinkedList reals = randomList(77);
        displayReals("\nThe real numbers ...", reals);

        LinkedList lengths = lengths(animals);
        displayLengths("\nThe lengths of the animal names ...", lengths);

        LinkedList reverseAnimals = reverse(animals);
        displayAnimals("\nThe animal names in reverse order ...", reverseAnimals);

        double minimum = minimum(reals);
        System.out.println("\nThe minimum number = " + minimum);
        displayReals("\nThe real numbers ...", reals);

        LinkedList orderedList = sort(reals);
        displayReals("\nThe real numbers in ascending order ...", orderedList);
        displayReals("\nThe real numbers ... ", reals);

    }

    private static LinkedList createAnimalList() {
        LinkedList a = new LinkedList<>();
        a.add("aardvark");
        a.add("bear");
        a.add("crocodile");
        a.add("dove");
        a.add("elephant");
        a.add("finch");
        a.add("giraffe");
        a.add("hyena");
        a.add("iguana");
        a.add("jackalope");
        a.add("bat");
        a.add("walrus");
        a.add("lobster");

        return a;
    }

    private static void displayAnimals(String the_animal_names_, LinkedList animals) {
        System.out.println(the_animal_names_);
        System.out.print("< ");
        int j = 1;
        for (int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i) + " ");
            j++;
            if (j % 10 == 0) {
                System.out.print("\n");
            }
        }
        System.out.print(">");
        System.out.print("\n");

    }

    private static LinkedList randomList(int i) {
        LinkedList<Double> temp = new LinkedList<>();
        for (int j = 0; j < i; j++) {
            int Num = (int) (Math.random() * 1000);
            double number = (double) Num / 10;
            temp.add(number);

        }
        return temp;
    }

    private static void displayReals(String the_real_numbers_, LinkedList reals) {
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(the_real_numbers_);
        System.out.print("< ");
        int j = 1;
        for (Iterator i = reals.iterator(); i.hasNext(); j++) {
            double num = (Double) i.next();
            System.out.print(df.format(num) + " ");
            if (j % 10 == 0) {
                System.out.print("\n");
            }
        }
        System.out.print(">");
        System.out.print("\n");

    }

    private static LinkedList lengths(LinkedList animals) {
        LinkedList length = new LinkedList<>();
        for (int i = 0; i < animals.size(); i++) {
            length.add(animals.get(i).toString().length());
        }
        return length;
    }

    private static void displayLengths(String the_lengths_of_the_animal_names_, LinkedList lengths) {
        System.out.println(the_lengths_of_the_animal_names_);
        System.out.print("<");
        int j = 1;
        for (int i = 0; i < lengths.size(); i++) {
            System.out.print(lengths.get(i) + " ");
            j++;
            if (j % 10 == 0) {
                System.out.print("\n");
            }
        }
        System.out.print(">");
    }

    private static LinkedList reverse(LinkedList animals) {
        String animal;
        LinkedList reverseAnimals;
        if (animals.isEmpty()) {
            return animals;
        } else {
            animal = (String) animals.removeFirst();
            reverseAnimals = reverse(animals);
            reverseAnimals.add(animal);
        }
        return reverseAnimals;
    }

    private static double minimum(LinkedList<Double> reals) {
        double minimum = 100;
        for (Double number : reals) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    private static LinkedList sort(LinkedList<Double> reals) {
        LinkedList<Double> c = new LinkedList<>(reals);
        if (c.isEmpty()) {
            return c;
        }
        Double m = minimum(c);
        c.remove(m);
        c = sort(c);
        c.addFirst(m);
        return c;
    }

}
