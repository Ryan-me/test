/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string.reverse;

import java.util.Scanner;

/**
 *
 * @author messr2578
 */
public class StringReverse {
    int idk;
    /**
     * @param args the command line arguments
     */
    // make the swap work
    public void swapS(char[] array, int p1, int p2) {
        char temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;

    }
    public String reverseString(String word){
        //base case
        if(idk >= (word.length()-1)-idk){
            return word;
        }
        //make the word into a character array to swap them
        char[] chars = word.toCharArray();
        //swap the two points
        swapS(chars,idk,(word.length()-1)-idk);
        idk++;
        //reonvert to string
        word = String.valueOf(chars);
        //recoursion
        word = reverseString(word);
        //end
        return word;
    }
    // making it work non recousively(ignore)
    public String reverseString2(String word){
        for (int j = 0; j < word.length(); j++) {
        
        char[] chars = word.toCharArray();
        swapS(chars,j,(word.length()-1)-j);
            
            System.out.println(word);
        }
        return word;
    }
    public static void main(String[] args) {
        // testing it
        StringReverse test = new StringReverse();
        String hey =test.reverseString("track");
        System.out.println(hey);
    }
    
}
