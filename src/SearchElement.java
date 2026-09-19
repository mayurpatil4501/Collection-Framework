import java.util.ArrayList;
public class SearchElement {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        int search = 300;

        if (list.contains(search)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not found");
        }
        System.out.println(list.indexOf(search));
    }
}
