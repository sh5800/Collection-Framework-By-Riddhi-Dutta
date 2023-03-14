package shreyash;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
//        OurGenericList<Integer> list = new OurGenericList<>();
//        List<Integer> alist = new ArrayList<>();
//        alist.add(1);
//        alist.add(2);
//        alist.add(3) ;
//        alist.add(2);

//        Integer[] arr = alist.toArray(new Integer[0]);
//        for (int x: arr) {
//            System.out.println(x + " ");
//        }

//        System.out.println("element that got replaced = " + alist.set(1,100));
//        List<Integer> alist2 = new ArrayList<>();
//        alist2.add(4);
//        alist2.add(5);
//        alist2.add(6);

//        alist2.addAll(alist);
//        System.out.println(alist.lastIndexOf(2));

//        List<Integer> alist3 = alist2.subList(1,4);
//        alist3.set(0,100);
//        System.out.println(alist3);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(alist);
//        System.out.println(alist2);

//        for (int x: alist){
//            System.out.println(x);
//        }
//        List<Integer> lk = new LinkedList<>();
//        lk.add(1);
//        lk.add(2);
//        lk.add(3);
//
//        ListIterator<Integer> iterator = lk.listIterator();
//
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.previous());

//        next - return items[index++];
//        prev - return items[--index];

        //FIFO queue -> Queue with LinkedList
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(1);
//        q.offer(2);

//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q.isEmpty());
//        System.out.println(q.poll());
//        System.out.println(q.peek());

        //LIFO stack -> Stack Class
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//
//        while(!stack.isEmpty()){
//            System.out.println(stack.peek());
//            stack.pop();
//        }

//        Deque -> ArrayDeque

//        Deque<Integer> dq = new ArrayDeque<>();
//        dq.offerLast(1);
//        dq.offerLast(2);
//        System.out.println(dq);
//        dq.pollFirst();
//        System.out.println(dq.peekFirst());
//        System.out.println(dq);

        /* what if we want top2 elements of bottom2*/
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(0);
//        pq.offer(100);
////        System.out.println(pq);
//        //top 2 elements
//        List<Integer> bottom2 = new ArrayList<>();
//        int index = 0;
//        while(!pq.isEmpty()){
//            if(index == 2)
//                break;
//            bottom2.add(pq.poll());
//            index++;
//        }
////        System.out.println(bottom2);
////        System.out.println(pq);
//
////        get me the top3 students according to their maths marks
//        List<StudentMarks> stMarks = new ArrayList<>();
//        stMarks.add(new StudentMarks(70,80));
//        stMarks.add(new StudentMarks(38,10));
//        stMarks.add(new StudentMarks(100,30));
//        stMarks.add(new StudentMarks(50,80));
//        stMarks.add(new StudentMarks(90,19));
//
//        PriorityQueue<StudentMarks> spq = new PriorityQueue<>((s1,s2) -> s2.getPhysics() - s1.getPhysics());
//        for(StudentMarks sm: stMarks){
//            spq.offer(sm);
//        }
//        System.out.println(spq);
//        List<StudentMarks> top3 = new ArrayList<>();
//        index = 0;
//        while(!spq.isEmpty()){
//            if(index == 3)
//                break;
//            top3.add(spq.poll());
//            index++;
//        }
//        System.out.println(top3);

//        Set<Integer> set1 = new HashSet<>(alist);
//        System.out.println(set1.contains(1));
//        System.out.println(set1.contains(200));
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(2);
//        set2.add(3);
//        set2.add(4);
//        set2.add(2);
//        set2.add(0);
//
//        Set<Integer> set3 = new LinkedHashSet<>();
//        set3.add(2);
//        set3.add(3);
//        set3.add(4);
//        set3.add(2);
//        set3.add(0);

//        System.out.println(set1);
//        System.out.println(set2);
//
//        System.out.println("After retaining");
//        set1.addAll(set2);
//
//        System.out.println(set1);
//        System.out.println(set2);

//        for(int x: set2){
//            System.out.print(x + " ");
//        }
//
//        System.out.println();
//
//        for(int x: set3){
//            System.out.print(x + " ");
//        }

//        Set<StudentMarks> set4 = new HashSet<>(stMarks);
//        System.out.println(set4.contains(new StudentMarks(70,80) ));
//
//        for (StudentMarks x: set4) {
//            System.out.println(x);
//        }

//        Set<StudentMarks> treeSet = new TreeSet<>((s1,s2) -> s2.getPhysics() - s1.getPhysics());
//        treeSet.add(new StudentMarks(70,80));
//        treeSet.add(new StudentMarks(30,10));
//        treeSet.add(new StudentMarks(100,30));
//        treeSet.add(new StudentMarks(40,88));
//        treeSet.add(new StudentMarks(97,19));
//
//        for(StudentMarks x: treeSet){
//            System.out.println(x);
//        }
//
//        System.out.println();

//        NavigableSet<Integer> set5 = new TreeSet<>();
//        set5.add(8);
//        set5.add(3);
//        set5.add(1);
//        set5.add(0);

//        for (int x: set5) {
//            System.out.println(x);
//        }
//        System.out.println();
//        System.out.println(set5.higher(1));

//        Map<String, Integer> map = new HashMap();
//        map.put("xyz",1);
//        map.put("pqr",2);
//        map.put("abc",7);
//        map.remove("xyz");
//        System.out.println(map.get("lmn"));
//        System.out.println(map.getOrDefault("djsk",0));
//        System.out.println(map.getOrDefault("pqr",2));
//        System.out.println(map.containsKey("xyz"));

//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        Set<String> keySets = map.keySet();
//        System.out.println(keySets);
//        for (String key: keySets) {
//            System.out.println(key + " " + map.get(key));
//        }
//
//        NavigableMap<Integer, String> tmap = new TreeMap<>((a,b) -> b-a);
//        tmap.put(1,"xyz");
//        tmap.put(2,"pqr");
//        tmap.put(3,"abc");
        
//        System.out.println(tmap);
//        Set<Integer> kset = tmap.keySet();
//        for (int x: kset) {
//            System.out.println(x + " " + tmap.get(x));
//        }
    }
}
