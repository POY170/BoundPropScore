/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropscore;

import java.util.Scanner;
/**
 *
 * @author POY
 */
public class BoundPropScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyBean mysource = new MyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mysource.addPropertyChangeListener(listener1);
        mysource.addPropertyChangeListener(listener2);
        
        Scanner inp = new Scanner(System.in);
        String score;
        boolean quit = true;
        while(quit) {
            System.out.print("Enter Score ");
            score = inp.nextLine();
            mysource.setScore(score);
            if(score.equals("")){
                quit = false;
            }
        }
    }
    
}
