import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args) {

        List<Person> friends = getFriends();

        /* declarative way
        for(Person friend : friends) {
         if(friend.age == 17) {
                peersFriends.add(friend);
            }
        }
        */

        // imperative way

        // filter
        List<Person> peersFriends =  friends.stream()
               .filter(friend -> friend.getAge() == 17)
               .collect(Collectors.toList());

        // sorted
        friends = friends.stream()
               .sorted(Comparator.comparing(Person::getAge).reversed())
               .collect(Collectors.toList());

        // all match
        boolean allMatch = friends.stream().allMatch(friend -> friend.getAge() < 12);
        boolean anyMatch = friends.stream().anyMatch(friend -> friend.getAge() > 16);
        boolean noneMatch = friends.stream().noneMatch(friend -> friend.name == "Kazimir");

        // max
        Optional<Person> max = friends.stream().max(Comparator.comparing(Person::getAge));

        // min
        Optional<Person> min = friends.stream().min(Comparator.comparing(Person::getAge));

        // group

        // lol idk sorry can't do an example


        System.out.println(friends);
        System.out.println(peersFriends);
        System.out.println(allMatch);
        System.out.println(noneMatch);
        System.out.println(max);
        System.out.println(min);

    }

    public static int solution(int number) {
        return number * 2;

    }

    private static List<Person> getFriends() {
        return List.of(
                new Person("Danya Hamula", 17),
                new Person("Kirill Charyshnikov", 17),
                new Person("Igor Murzakov", 13),
                new Person("Pavel Tockmach", 16),
                new Person("Kirill FLIPY", 16)
        );
    }

}