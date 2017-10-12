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
    int save;
    /**
     * @param args the command line arguments
     */
    
    public String reverseString(String word){
        save++;
        System.out.println(save);
        if(word.length()== save){
            return word;
        }
        char fst = word.charAt(save);
        char lst = word.charAt(word.length()- save);
        word = word.replace(fst, lst);
        System.out.println(word);
        
        return reverseString(word);
    }
    public String reverseString2(String word){
        save++;
        System.out.println(save);
        if(word.length()== save){
            return word;
        }
        for(int i =0; i< word.length()- 1; i++){
        char fst = word.charAt(i);
        char lst = word.charAt(word.length()- i);
        word = word.replace(fst, lst);
        System.out.println(word);
        }
        return word;
    }
    public static void main(String[] args) {
        // testing it
        StringReverse test = new StringReverse();
        test.reverseString2("cat");
    }
}
