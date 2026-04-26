public class Main {
    static class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder sb = new StringBuilder();
            int max = word1.length() < word2.length() ? word1.length() : word2.length();
            int i = 0;

            while (i < max) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
                i++;
            }

            if (word1.length() > max) {
                sb.append(word1.substring(max, word1.length()));
            }
            
            if (word2.length() > max) {
                sb.append(word2.substring(max, word2.length()));
            }
            
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.mergeAlternately("abc", "pqr"));
        System.out.println(obj.mergeAlternately("a44444444444b", "pqrs"));
        System.out.println(obj.mergeAlternately("abcd", "pq"));
    }
}