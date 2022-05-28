public class Main {

    public static void main(String[] args) {

        /*  overloaded constructors = multiple constructors within a class with the same name,
                                      but have different parameters
                                      name + parameters = signature                           */

        Pizza pizza = new Pizza("thicc crust", "Ketchup", "Mozzarella", "Italic salami, mushrooms");
        pizza.showIngredients();
        Pizza margarita = new Pizza("thicc crust", "Ketchup", "Mozzarella");
        margarita.showIngredients();

    }


}
