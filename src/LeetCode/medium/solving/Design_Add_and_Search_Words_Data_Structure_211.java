package LeetCode.medium.solving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Date-3/18/2023
 * Time-11:03 PM
 */
public class Design_Add_and_Search_Words_Data_Structure_211 {
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("sarsdorsbeksjon");
        System.out.println(wordDictionary.search("sar.dor.bek.jon"));
//         return False
//         return True
//         return True
//         return True
    }


    static class WordDictionary {
        List<String> list = new ArrayList<>();

        public WordDictionary() {

        }

        public void addWord(String word) {
            list.add(word);
        }

        public boolean search(String word) {
            String[] str = word.split("\\.");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() == word.length()) {
                    if (isEqual(list.get(i), str))
                        return true;
                }
            }
            return false;
        }

        public boolean isEqual(String words, String[] searchWord) {
            boolean isTrue = false;
            switch (searchWord.length) {
                case 1:
                    isTrue = words.startsWith(searchWord[0]);
                    break;
                case 2:
                    isTrue = words.startsWith(searchWord[0]) && words.endsWith(searchWord[1]);
                    break;
                case 3:
                    isTrue = words.startsWith(searchWord[0])&& words.substring(searchWord[0].length()+1,searchWord[1].length()+1+searchWord[0].length()).equals(searchWord[1]) && words.endsWith(searchWord[2]);
                    break;
                case 4:
                    isTrue = words.startsWith(searchWord[0])&& words.substring(searchWord[0].length()+1,searchWord[1].length()+1+searchWord[0].length()).equals(searchWord[1]) && words.substring(searchWord[1].length()+searchWord[0].length()+2,searchWord[1].length()+searchWord[0].length()+2+searchWord[2].length()).equals(searchWord[2]) && words.endsWith(searchWord[3]);
                    break;
                default:isTrue=true;

            }
            return isTrue;

        }
    }
}
