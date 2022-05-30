public class Main {

    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member

        // My explanation: all objects share static variable, and if you change it trough one object, it'll change on others too

        Friend friend1 = new Friend("Danya Hamula");
        Friend friend2 = new Friend("Kiril Charyshnikov");
        Friend friend3 = new Friend("Igor Murzakov");
        Friend friend4 = new Friend("Klim AngaraRiver");
        Friend friend5 = new Friend("Pavel Tockmach");

        Friend.displayFriends();
        friend4.numberOfFriends = 8;
        Friend.displayFriends();


    }


}
