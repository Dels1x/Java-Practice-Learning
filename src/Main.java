public class Main {

    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Ice cream");
        Food food2 = new Food("Pizza");
        Food food3 = new Food("Tiramisu");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        for(Object i : refrigerator){
            System.out.println(i);
        }

    }


}
