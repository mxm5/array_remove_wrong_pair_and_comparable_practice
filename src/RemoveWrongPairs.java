import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveWrongPairs {


    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>(List.of(3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));


        if (list.size() % 2 != 0) list.remove(list.size() - 1);
        //        make pairs

        System.out.println(list.size() + "size");
        for (int i = 0; i < list.size(); i += 2) {
            System.out.println(list.get(i) + " " + list.get(i + 1) + " index " + i);
            if (list.get(i) > list.get(i + 1)) {
                System.out.println(list.get(i) + " > " + list.get(i + 1) + " true");
                list.remove(i + 1);
                System.out.println(list + " removed the second element");
                list.remove(i);
                System.out.println(list + " removed the first element");
                i -= 2;
            }
        }

        System.out.println(list);
    }

}
