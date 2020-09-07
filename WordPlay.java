
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    public boolean isVowel(char ch){
        String vowels = "aeiouAEIOU";
        if(vowels.indexOf(ch) != -1)
            return true;
        else return false;
    }
    
    public String replaceVowels (String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for(int i = 0; i < phrase.length(); i++){
            if(isVowel(phrase.charAt(i))){
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }
    
    public String emphasize(String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for(int i = 0; i < phrase.length(); i++){
            if(phrase.charAt(i) == Character.toLowerCase(ch) ||
               phrase.charAt(i) == Character.toUpperCase(ch)){
                   if(i % 2 == 0){
                       sb.setCharAt(i, '*');
                   }else{
                       sb.setCharAt(i, '+');                       
                    }
            }
        }   
        return sb.toString();
    }
    
    public void testIsVowel(){
        /*System.out.println("a = " + isVowel('a'));
        System.out.println("A = " + isVowel('A'));
        System.out.println("F = " + isVowel('F'));
        System.out.println("f = " + isVowel('f'));
        System.out.println("AHello Worldu = " + replaceVowels("AHello Worldu", '*'));
        */System.out.println("emphasize(\"dna ctgaaactga\", 'a') = " + emphasize("dna ctgaaactga", 'a'));
        System.out.println("emphasize(\"Mary Bella Abracadabra”, ‘a’) = " + emphasize("Mary Bella Abracadabra", 'a'));
        
    }
}
