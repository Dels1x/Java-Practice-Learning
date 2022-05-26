import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> Hardware = new ArrayList<ArrayList<String>>();

        ArrayList<String> CPUs = new ArrayList<String>();
        ArrayList<String> GPUs = new ArrayList<String>();
        ArrayList<String> RAMs = new ArrayList<String>();

        CPUs.add("intel i5 12400f");
        CPUs.add("AMD Ryzen 5800X");
        CPUs.add("AMD Phenom B55");

        GPUs.add("AMD RX 6600 XT");
        GPUs.add("GeForce RTX 3080 Ti");
        GPUs.add("GeForce GTX 260");

        RAMs.add("16GB");
        RAMs.add("64GB");
        RAMs.add("4GB");

        Hardware.add(CPUs);
        Hardware.add(GPUs);
        Hardware.add(RAMs);

        for(int i = 0; i < Hardware.size(); i++){
            for(int j = 0; j < Hardware.size(); j++){
                System.out.print(Hardware.get(j).get(i) + " ");
            }

            System.out.println();
        }

    }
}
