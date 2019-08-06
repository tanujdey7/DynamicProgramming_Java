import java.util.Arrays;
class Anagrams {
    public static void main(String[] args) {
        boolean flag = false;
        String str1 = "asdrthjkl";
        String str2 = "lkjhgfdsa";
        char c1[] = str1.toCharArray();
        char c2[] = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0 ; i < c1.length ; i++) {
            if(c1[i] != c2[i]) {
                flag = true;
            }
        }
        if(flag == true) {
            System.out.println("Not a Anagram");
        }
        else {
            System.out.println("It is a Anagram");
        }
    }
}
