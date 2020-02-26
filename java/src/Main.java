import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        main.result(list, x -> true);
        main.result(list, x -> x % 2 == 0);
        main.result(list, x -> x % 2 != 0);
    }

    public void result(List<Integer> list, Predicate<Integer> predicate){
        System.out.println(list.stream().filter(predicate).mapToInt(e->e).sum());
    }

}
