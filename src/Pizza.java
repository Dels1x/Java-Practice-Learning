public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping = "";

    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    void showIngredients(){
        System.out.println("Here are the ingridient of your pizza: ");
        System.out.println();
        System.out.println(this.bread);
        System.out.println(this.sauce);
        System.out.println(this.cheese);
        if(!this.topping.isBlank()){
            System.out.println(this.topping);
        }

    }
}
