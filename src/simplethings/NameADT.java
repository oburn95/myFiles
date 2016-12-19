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
public interface NameADT {
    public String first();
    public String last();
    public String natural();
    public String formal();
    public boolean check(String fi, String li);
}
