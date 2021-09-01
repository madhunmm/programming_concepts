import java.util.HashSet;
import java.util.Set;

public class Anagram
{
    private Set<String> permute(String str, String remaining, Set<String> finalList)
    {
        if(remaining.isEmpty())
        {
            //System.out.println(str);
            finalList.add(str);
        }
        char[] arr = remaining.toCharArray();
        
        for(char c : arr)
        {
            StringBuffer sbAnagram = new StringBuffer(str).append(c);
            StringBuffer sbRemaining = new StringBuffer(remaining).deleteCharAt(remaining.indexOf(c));
            permute(sbAnagram.toString(), sbRemaining.toString(),finalList);
        }
        return finalList;
    }
    public void permute(String str)
    {
        Set<String>finalList = new HashSet<>();
        permute("",str, finalList);
        for(String s : finalList)
        {
            System.out.println(s);
        }
        System.out.println(finalList.size());
    }
    public static void main(String args[])
    {
        new Anagram().permute("apple");
    }
}
