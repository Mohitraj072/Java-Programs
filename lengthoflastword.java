public class lengthoflastword {
    public static void main(String[] args) { 
        String str= "Hello World";
        String[] words = str.trim().split(""); 
        System.out.println("LengthofLast Word= "+ words[words.length- 1].length()); 
    }
    
}
