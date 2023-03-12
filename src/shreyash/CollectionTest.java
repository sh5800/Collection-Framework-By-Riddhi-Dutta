package shreyash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
//        OurGenericList<Integer> list = new OurGenericList<>();
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3) ;

//        System.out.println("element that got replaced = " + alist.set(1,100));
        List<Integer> alist2 = new ArrayList<>();
        alist2.add(4);
        alist2.add(5);
        alist2.add(6);

        alist2.addAll(alist);

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(alist);
        System.out.println(alist2);

//        for (int x: alist){
//            System.out.println(x);
//        }
    }
}
