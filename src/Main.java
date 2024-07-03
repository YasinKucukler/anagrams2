import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean check = true;

        Map<Character, Integer> frequencyOfLetter1 = calculateFrequency(str1);
        Map<Character, Integer> frequencyOfLetter2 = calculateFrequency(str2);

        for(char c = 'a'; c <= 'z'; c++)
        {
            int count1 = frequencyOfLetter1.getOrDefault(c, 0);
            int count2 = frequencyOfLetter2.getOrDefault(c, 0);
            if(count1 != 0 || count2 != 0)
            {
                if (count1 != count2)
                {
                    check = false;
                    break;
                }
            }
        }
        if (check)
        {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
    private static Map<Character, Integer> calculateFrequency(String word) {
        Map<Character, Integer> frequencyOfWord = new HashMap<>();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                frequencyOfWord.put(c, frequencyOfWord.getOrDefault(c, 0) + 1);
            }
        }

        return frequencyOfWord;
    }
}
