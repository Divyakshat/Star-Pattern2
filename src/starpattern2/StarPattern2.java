/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpattern2;

/**
 *
 * @author divyanshu
 */
public class StarPattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //right-aligned right angle star* trinagular pattern
        {       for(int i=1;i<=6;i++)
                {  
                    for(int j=6;j>=i;j--)
                    {
                        System.out.print(" ");
                    }    for(int k=1;k<=i;k++)
                        {
                            System.out.print("*");
                        }
                    System.out.println();
                }
    }
    
}
