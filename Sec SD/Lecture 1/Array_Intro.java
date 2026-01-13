
import java.util.ArrayList;

public class Array_Intro {

    public static void main(String[] args) {
        //Java Array syntax;

        //Datatype variable name [] = new Datatypes[size];
        // int arr[] = new int[5];
        // System.out.println(arr);
        // //accessing in array -> Indexing;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        //update value;
        // arr[0] = 55;
        // arr[2] = 65;
        // arr[3] = 2;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        //printing array;
        // for(intilization;condition;updatation){
        //     //logic;
        // }
        // for(int i = 0;i < arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // ArrayList;
        //Syntax;
        // ArrayList<Data Types>variablename = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();

        //size;
        int n = al.size();
        System.out.println(n);

        //insert -> al.add();
        al.add(5);
        al.add(15);
        al.add(9);
        al.add(13);
        al.add(67);

        System.out.println(al.size());

        //Accessing -> al.get();
        System.out.println(al.get(2));
        System.out.println(al.get(4));

        //update -> al.set();
        al.set(2, 89);

        //loop;
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i));
        }

    }

}
