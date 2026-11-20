
public class CountVowels {
 public static void main(String[] args){
     String input = "Hello, World!";
     int count =0;
     for (int i=0; i<input.length();i++){
         char ch = input.charAt(i);
         
         count  = switch (ch) {
             case 'a', 'e', 'i', 'o', 'u', 
                  'A', 'E', 'I', 'O', 'U' -> count + 1;
             default -> count;
         };
       
     }
     System.out.println("Number of vowels: " + count);
     
     char[] charArray = input.toCharArray();
        int vowelCount = 0;
        for (char c : charArray) {
            
         vowelCount  = switch (c) {
             case 'a', 'e', 'i', 'o', 'u', 
                  'A', 'E', 'I', 'O', 'U' -> vowelCount + 1;
             default -> vowelCount;
         };
        }
        System.out.println("Number of vowels (using char array): " + vowelCount);
 }    
}