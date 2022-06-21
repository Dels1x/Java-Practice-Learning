import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        String s1 = "LovePizza";
        String[] array = solution(s1);

        for(String i : array) {
            System.out.println(i);
        }


    }

    public static String[] solution(String s) {
        int arrayLength;
        if(s.length() % 2 == 0){
            arrayLength = s.length() / 2;
        }
        else{
            arrayLength = 1 + s.length() / 2;
        }
        String[] lettersArray = new String[arrayLength];
        String str = "";
        System.out.println("array length: " +arrayLength);
        for(int i = 0; i < s.length(); i+=2){
            if(s.length() % 2 == 0) {
                str = s.substring(i, i+2);
            }
            else {
                if(i+1 == s.length()){
                    str = s.substring(i) + "_";
                    System.out.println(s.substring(i) + "_");
                }
                else{
                    str = s.substring(i, i+2);
                    System.out.println(s.substring(i, i+2));
                }
            }
            lettersArray[i / 2] = str;
            System.out.println(lettersArray);

        }
        

        return lettersArray;
    }

}
