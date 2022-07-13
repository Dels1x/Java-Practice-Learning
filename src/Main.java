public class Main {
    public static void main(String[] args) {


        System.out.println(SpinWords.spinWords("Hey fellow warriors"));

    }


}

class SpinWords {

    public static String spinWords(String sentence) {
        StringBuilder sb;
        String[] arr = sentence.split(" ");

        StringBuilder sentenceBuilder = new StringBuilder();
        for (String i: arr) {
            if (i.length() >= 5) {
                sb = new StringBuilder(i);
                sentenceBuilder.append(sb.reverse()).append(" ");
            }
            else
                sentenceBuilder.append(i).append(" ");
        }
        sentence = sentenceBuilder.toString();

        return sentence.trim();

    }
}