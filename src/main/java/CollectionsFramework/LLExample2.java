package CollectionsFramework;

public class LLExample2 {
    public static void main(String[] args) {
        java.util.LinkedList<String> ll = new java.util.LinkedList<String>();
        ll.add("Brian");
        ll.add("Kim");
        ll.add("Patrick");
        ll.add("Harsh");

        //ll.removeFirst();
        //ll.removeLast();
        ll.remove(1);
        ll.add("Kim");
        System.out.println(ll);
    }
}
