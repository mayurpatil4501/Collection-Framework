import java.util.ArrayList;
public class SmallestElement {
    static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(38);
        list.add(49);
        list.add(48);
        list.add(29);
        list.add(39);
        int smallest=list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)<smallest) {
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest"+smallest);
    }
}
