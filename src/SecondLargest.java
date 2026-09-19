import java.util.ArrayList;
public class SecondLargest {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(39);
        list.add(32);
        list.add(38);
        list.add(20);
        list.add(40);
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MAX_VALUE;

        for(int i=0;i<list.size();i++){
            int num = list.get(i);
            if(num>largest){
                secondlargest=largest;
                largest=num;
            } else if (num>secondlargest && num!=largest) {
                secondlargest=num;
                
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondlargest);
    }
}
