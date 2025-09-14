package Strings;
public class RabinKarp {
    static final int PRIME = 101;
    public static double calculateHash(String str) {
        double hash = 0;
        for(int i=0; i<str.length(); i++) {
            hash = hash + str.charAt(i)*Math.pow(PRIME, i);
        }
        return hash;
    }

    public static double updateHash(double prevHash, char oldChar, char newChar, int patternLength) {
        double hash = (prevHash-oldChar)/PRIME;
        hash = hash + newChar*Math.pow(PRIME, patternLength-1);
        return hash;
    }
    public static void main(String[] args) {
        String text = "ababababa";
        String pattern = "ab";

        double textHash = calculateHash(text.substring(0, pattern.length()));
        double patternHash = calculateHash(pattern);
        for(int i=0; i<text.length()-pattern.length()+1; i++) {
            if(textHash==patternHash) {
                if(text.substring(i, i+pattern.length()).equals(pattern)){
                    System.out.println("Pattern matched starting from index "+i);
                }
            }

            if(i<text.length()-pattern.length()) {
                textHash=updateHash(textHash, text.charAt(i), text.charAt(i+pattern.length()), pattern.length());
            }

        }
        System.out.println("Rabin Karp");
    }
}
