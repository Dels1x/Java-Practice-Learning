public class Main {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);

        System.out.println(dynamicArray.getCapacity());
        System.out.println(dynamicArray.isEmpty());

        dynamicArray.add("HLTV");
        dynamicArray.add("Steam");
        dynamicArray.add("YouTube");
        dynamicArray.add("Twitch");
        dynamicArray.insert(2,"CSGO");
        dynamicArray.add("Reddit");
        dynamicArray.add("Sporcle");
        dynamicArray.add("Twitter");

        dynamicArray.delete("YouTube");
        dynamicArray.delete("Twitch");
        dynamicArray.delete("CSGO");
        dynamicArray.delete("Reddit");
        dynamicArray.delete("Sporcle");
        dynamicArray.delete("Twitter");

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.getSize());
        System.out.println(dynamicArray.getSize());

        dynamicArray.delete("Steam");

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.search("YouTube"));

    }
}