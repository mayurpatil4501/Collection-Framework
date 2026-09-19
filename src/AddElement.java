import java.util.ArrayList;
public class AddElement {
    static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1,50); //adding element in list
        System.out.println(list);
    }
}
