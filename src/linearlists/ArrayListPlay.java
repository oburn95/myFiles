/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearlists;

import java.util.ArrayList;
import simplethings.Name;
import simplethings.Triangle;

/**
 *
 * @author Sean
 */
public class ArrayListPlay {

    public static void main(String[] args) {

        ArrayList<String> songs = createSongList();
        display("the songs ... ", songs);
        ArrayList<Name> actors = createActorList();
        display("the actors ... ", actors);
        ArrayList<Triangle> triangles = createTriangleList();
        display("the triangles ... ", triangles);

        displayTitles(songs);
        displayInitials(actors);
        displayAreas(triangles);
    }

    private static ArrayList createSongList() {
        ArrayList<String> songs = new ArrayList();
        songs.add("Hell aint a bad place to be");
        songs.add("New level");
        songs.add("Halftime");
        songs.add("24");
        songs.add("Shelter from the Strom");
        songs.add("Yesterday");
        songs.add("One");
        songs.add("Don't think twice, it's alright");
        return songs;
    }



    private static ArrayList createActorList() {
        ArrayList<Name> actors = new ArrayList();
        Name n = new Name("Tupac", "Shakur");
        Name a = new Name("Arnold", "Schwarzenegger");
        Name g = new Name("Ed", "Harris");
        Name q = new Name("Ned", "Beaty");
        Name e = new Name("James", "Kahn");
        Name z = new Name("Brad", "Pitt");
        Name o = new Name("Burt", "Reynolds");
        Name c = new Name("Winona", "Ryder");
        actors.add(n);
        actors.add(a);
        actors.add(g);
        actors.add(q);
        actors.add(e);
        actors.add(z);
        actors.add(o);
        actors.add(c);
        return actors;
    }

    private static ArrayList createTriangleList() {
        ArrayList<Triangle> triangles = new ArrayList();
        Triangle timmy = new Triangle(10);
        triangles.add(timmy);
        Triangle ed = new Triangle(16);
        Triangle ida = new Triangle(3, 4, 5);
        triangles.add(ida);
        return triangles;
    }

    private static void displayTitles(ArrayList<String> song) {
        System.out.println("The song title lengths ...");
        for (String s : song) {
            System.out.println(s.length());
        }
        System.out.println("...\n");
    }

    private static void displayInitials(ArrayList<Name> actors) {
        System.out.println("The initials ...");
        for (Name s : actors) {
             System.out.println(s.first().substring(0,1) + s.last().substring(0,1));
        }
        System.out.println("...\n");

    }

    private static void displayAreas(ArrayList<Triangle> triangles) {
        System.out.println("The areas ...");
        for (Triangle t : triangles) {

            System.out.println(t.area());
        }
        System.out.println("...");
    }

    private static void display(String o, ArrayList s) {
        System.out.println(o);
        for (int i = 0; i < s.size(); i++) {
           if(s.get(i)instanceof String){
              String n = (String) s.get(i);
              System.out.println(n);
          } 
          if(s.get(i)instanceof Name){
              Name n = (Name) s.get(i);
              System.out.println(n.natural());
          }
          if(s.get(i)instanceof Triangle){
              Triangle t = (Triangle) s.get(i);
              System.out.println(t.toString());
        }
        }
        System.out.println("");
    }




}

