package task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        RBTree tree = new RBTree();

        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(50);
            if(!list.contains(temp))
                list.add(temp);
        }
        System.out.println(list.toString());
        for (Integer num: list)
            tree.addNode(num);
        tree.inOderTraverseNode(tree.root);
        System.out.println("Root is: " + tree.root);

        tree = new RBTree();
        list.sort(Comparator.comparingInt(o -> o));
        System.out.println("*************************************");
        System.out.println(list.toString());
        for (Integer num: list)
            tree.addNode(num);
        tree.inOderTraverseNode(tree.root);
        System.out.println("Root is: " + tree.root);
    }
}
