/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epstest;
import java.io.*;
/**
 *
 * @author dominic
 */
public class EPSTEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in));
        
        int zahl1,zahl2,ergebnis;
        
        zahl1 = Integer.parseInt(input.readLine());
        zahl2 = Integer.parseInt(input.readLine());
        ergebnis = zahl1 + zahl2;
        
        System.out.printf("%d", ergebnis);
        
        for (int i = 0; i < 10; i++) {
            System.out.append("Hallo Java");
        }
    }
}
