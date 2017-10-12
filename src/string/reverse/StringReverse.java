/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string.reverse;

/**
 *
 * @author messr2578
 */
public class StringReverse {
    int idk;
    /**
     * @param args the command line arguments
     */
    
    public String reverseString(String word){
        
        if(idk == word.length()- 2){
            return word;
        }
        int w = word.length() -1;
        char fst = word.charAt(idk);
        char lst = word.charAt(w- idk);
        word = word.replace(fst, lst);
        word = word.replace(lst, fst);
        System.out.println(word);
        idk++;
        return reverseString(word);
    }
    public String reverseString2(String word){
        int w = word.length();
        char fst = word.charAt(0);
        char lst = word.charAt(2);
        word = word.replace(lst, fst);
        System.out.println(word);
        return word;
    }
    public static void main(String[] args) {
        // testing it
        StringReverse test = new StringReverse();
        String hey =test.reverseString("cat");
    }
}
