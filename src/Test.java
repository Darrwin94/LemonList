public class Test {
    public static void main(String[] args) {

        LemonArrayList<Integer> list = new LemonArrayList();

        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(list.get(1));
        System.out.println(list.size());
        list.remove(1);

        System.out.println(list.get(1));
        System.out.println(list.size());
    }

}
