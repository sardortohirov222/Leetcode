package LeetCode.easy;

public class Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] splittedWords = s.split(" ");
        for(String word : splittedWords){
            StringBuilder revWord = new StringBuilder();

            revWord.append(word);
            revWord.reverse();
            result.append(revWord.toString() + " ");
        }

        result.setLength(result.length() - 1);
        return result.toString();
    }
}
