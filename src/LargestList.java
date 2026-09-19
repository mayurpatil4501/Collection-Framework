import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
public class LargestList {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(38);
        list.add(48);
        list.add(57);
        list.add(50);
        list.add(37);
        int largest=list.get(0);

        for(int i=0; i<list.size();i++){
            if(list.get(i)> largest){
                largest= list.get(i);
            }
        }
        System.out.print("Largest Element Is"+largest);
    }
}
