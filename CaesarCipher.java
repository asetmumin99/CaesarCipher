import edu.duke.*;

public class CaesarCipher {
    public String encrypt(String input, int key) {
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String upAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowAlphabet = "abcdefghijklmnopqrstuvwxyz";
        //Compute the shifted alphabet
        String shiftedUpAlphabet = upAlphabet.substring(key)+
        upAlphabet.substring(0,key);
        String shiftedLowAlphabet = lowAlphabet.substring(key)+
        lowAlphabet.substring(0,key);
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int idxUp = upAlphabet.indexOf(currChar);
            int idxLow = lowAlphabet.indexOf(currChar);
            //If currChar is in the alphabet
            if(idxUp != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedUpAlphabet.charAt(idxUp);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
            if(idxLow != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedLowAlphabet.charAt(idxLow);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
    }
    
    public String encryptTwoKeys (String input, int key1, int key2) {
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String upAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowAlphabet = "abcdefghijklmnopqrstuvwxyz";
        //Compute the shifted alphabet
        String shiftedUpAlphabet1 = upAlphabet.substring(key1)+
        upAlphabet.substring(0,key1);
        String shiftedLowAlphabet1 = lowAlphabet.substring(key1)+
        lowAlphabet.substring(0,key1);
        
        String shiftedUpAlphabet2 = upAlphabet.substring(key2)+
        upAlphabet.substring(0,key2);
        String shiftedLowAlphabet2 = lowAlphabet.substring(key2)+
        lowAlphabet.substring(0,key2);
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int idxUp = upAlphabet.indexOf(currChar);
            int idxLow = lowAlphabet.indexOf(currChar);
            //If currChar is in the alphabet
            if(idxUp != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                
                char newChar = '\0';
                if(i % 2 == 0)
                    newChar = shiftedUpAlphabet1.charAt(idxUp);
                else
                    newChar = shiftedUpAlphabet2.charAt(idxUp);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
            if(idxLow != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = '\0';
                if(i % 2 == 0)
                    newChar = shiftedLowAlphabet1.charAt(idxLow);
                else
                    newChar = shiftedLowAlphabet2.charAt(idxLow);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
    }
    
    public void testCaesar() {
        int key = 17;
        /*FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26-key);
        System.out.println(decrypted);*/
        
        /*String encrypted = encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26-15);
        System.out.println(decrypted);*/
        
        /*String encrypted2 = encrypt("First Legion", key);
        System.out.println(encrypted2);
        String decrypted2 = encrypt(encrypted2, 26-key);
        System.out.println(decrypted2);*/
        
        String encrypted = encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21);
        System.out.println(encrypted);
        String decrypted = encryptTwoKeys(encrypted, 26-8, 26-21);
        System.out.println(decrypted);
        
        /*String encrypted2 = encrypt("First Legion", key);
        System.out.println(encrypted2);
        String decrypted2 = encrypt(encrypted2, 26-key);
        System.out.println(decrypted2);*/
        
        /*
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);*/
    }
}

