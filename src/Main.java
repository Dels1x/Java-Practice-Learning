import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(Persist.persistence(999));

    }
}

class Persist {
    public static int persistence(long n) {
        int sum;
        int count = 0;
        ArrayList<Integer> arrayList = Persist.toDigitsArrayList(n);

        while(arrayList.size() > 1) {
            sum = arrayList.get(0);

            for(int i = 1; i < arrayList.size(); i++) {
                sum *= arrayList.get(i);
            }

            count++;
            arrayList = Persist.toDigitsArrayList(sum);
        }

        return count;
    }

    static ArrayList<Integer> toDigitsArrayList(long n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < String.valueOf(n).length(); i++) {
            arrayList.add(Character.getNumericValue(String.valueOf(n).charAt(i)));
        }

        return arrayList;
    }
}