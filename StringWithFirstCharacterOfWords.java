import java.util.Scanner;
/*
input = Hello World this is an example text
output = HWtiaet
*/
public class StringWithFirstCharacterOfWords {
    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String split[] = str.split(" ");
        for(int i = 0 ; i < split.length ; i++) {
            System.out.print(split[i].charAt(0));
        }
    }
}