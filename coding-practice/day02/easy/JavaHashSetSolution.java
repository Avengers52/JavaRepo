import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSetSolution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int j = 0; j < t; j++) {
            pair_left[j] = s.next();
            pair_right[j] = s.next();
        }

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String name = pair_left[i]+","+pair_right[i];
            set.add(name);
            System.out.println(set.size());
        }
        s.close();
    }
}
