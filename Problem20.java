public class StringPermutations {
    
    // Recursive function to generate permutations
    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Choose the current character
            char ch = str.charAt(i);
            // Remaining string after removing the chosen character
            String ros = str.substring(0, i) + str.substring(i + 1);
            // Recurse for the remaining string
            permute(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All permutations of " + str + " are:");
        permute(str, "");
    }
}
