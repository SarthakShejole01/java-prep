public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        for(int i = input.length()-1; i>=0;i--){
            System.out.println(input.charAt(i));
        }
        
        StringBuilder inputBuilder = new StringBuilder();
        inputBuilder.append("Hello, World!");
        inputBuilder.reverse();
        System.out.println(inputBuilder.toString());
    }
    
}