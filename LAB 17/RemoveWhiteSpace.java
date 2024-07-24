package javafullstack;
public class RemoveWhiteSpace {
    public static void main(String[] args) {
        // Input string with multiple spaces and newline characters
        String word = "  wellcome \n to anudip   ";
        
        // Remove white spaces from the input string
        String result = removeWhiteSpaces(word);
        
        // Print the original input string
        System.out.println("Original String: " + word);
        
        // Print the processed string without white spaces
        System.out.println("String without white spaces: " + result);
    }
    
    // Method to remove all whitespace characters from a string
    public static String removeWhiteSpaces(String gesture) {
        // Using regular expression to replace all whitespace characters (\s) with empty string
        return gesture.replaceAll("\\s+","");
    }
}