import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PaginationHelper ph = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'v', 'd', 'l', 'a', 'b', 'c', 'v', 'd', 'l', 'a', 'b', 'c', 'v', 'd', 'l', 'a', 'b', 'c', 'v', 'd', 'l'), 10);
        System.out.println(ph.pageIndex(0));

    }


}

