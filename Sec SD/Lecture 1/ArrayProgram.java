
import java.util.ArrayList;

public class ArrayProgram {

    public static void main(String[] args) {
        //Array Create;
        // int[] arr = new int[5];
        // // System.out.println(arr);

        // //acess ->indexing -> 0 
        // // System.out.println(arr[0]);
        // // System.out.println(arr[2]);
        // // System.out.println(arr[1]);
        // //update value;
        // arr[1] = 4;
        // arr[3] = 7;
        // //array ka size -> arr.length;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr.length);
        //loop;
        // for(int i = 0;i<arr.length;i++){
        //     System.err.println(arr[i]);
        // }
        //ArraList 
        // ArrayList<Data type>variable_name = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();

        //arraylist ka size -> al.size();
        System.out.println(al.size());

        //insertion -> al.add();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(9);

        al.add(2, 99999);

        System.out.println(al.size());

        //access -> al.get(idx);
        System.out.println(al.get(2));//4

        //update -> al.set(idx,value);
        al.set(3, 89);//89

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }

}
