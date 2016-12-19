/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplethings;

/**
 *
 * @author Sean
 */
public class Name implements NameADT {

    String first, last;

    public Name(String f, String l) {
        first = f;
        last= l;
    }

    @Override
    public String first() {
        return  first;
    }

    @Override
    public String last() {
        return  last;
    }

    @Override
    public String natural() {
        return first + " " + last;
    }

    @Override
    public String formal() {
        return  last + "," + " " + first;
    }

    @Override
    public boolean check(String fi, String li) {
        return first.startsWith(fi) && last.startsWith(li);
    }

}
