package linkedList;

public class App {
    public static void main(String[] args){
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        nodeA.next = nodeB;
        Node node;
        node = nodeA;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }


}
