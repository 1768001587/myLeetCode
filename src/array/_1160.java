package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1160 {
    public static void main(String[] args) {
        String[] words = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
        System.out.println(countCharacters(words,"usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp"));
    }
    public static int countCharacters(String[] words, String chars) {
        int len = words.length;
        char[] tmp;
        int sum = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        first:for (int i = 0; i < len; i++) {
            Map<Character,Integer> mapTmp = new HashMap<>(map);
            String word = words[i];
            tmp = word.toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                if(mapTmp.get(tmp[j])==null||mapTmp.get(tmp[j])==0){//不存在或者已经等于0
                    continue first;
                }else {
                    mapTmp.put(tmp[j],mapTmp.get(tmp[j])-1);
                }
            }
            //System.out.println(word);
            sum+=word.length();
        }
        return sum;
    }
}
