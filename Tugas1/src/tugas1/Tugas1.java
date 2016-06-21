/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author andri
 */
public class Tugas1 {

   
    public static void main(String[] args) {
        int t = 5;
        for(int i=0; i<t; i++){
            for(int j=0; j<t; j++){
                if(i==2 || j==2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

        // TODO code application logic here
 