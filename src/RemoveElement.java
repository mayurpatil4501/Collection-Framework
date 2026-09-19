import java.util.ArrayList;
public class RemoveElement {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(38);
        list.add(47);

        list.remove(2);
        System.out.println(list);
    }
}
