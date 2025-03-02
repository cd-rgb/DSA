package linkedlist;

public class Doublyll {

    public class Node {
        int data;
        Node next = null;
        Node prev = null;

        public Node(int data) {
            this.data = data;
        }

    }

    public static Node head = null;
    public static Node tail = null;
    public static int size;

    public void addfirst(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
            size++;
            return;

        }
        head.prev = n;
        n.next = head;
        head = n;
        size++;
    }

    public void removefirst() {
        if (head == null) {

            return;

        }
        if (size == 1) {
            head = tail = null;
            size--;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void addlast(int data){
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
            size++;
            return;

        }
        tail.next=n;
        n.prev=tail;
        tail=n;
        size++;

    }

     public void printll(){

        if(head==null){
            return;
        }

        Node temp=head;

        while(temp!=null){
            System.out.print("<--"+temp.data+"-->");
            temp=temp.next;
        }

    }

    public void reverse(){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public static void main(String[] args) {
        Doublyll l1=new Doublyll();
        l1.addfirst(1);
        l1.addfirst(2);
        l1.addfirst(3);
        l1.addfirst(5);
        l1.addlast(10);
        
        // l1.removefirst();
        l1.printll();
        l1.reverse();
        l1.printll();

    }

}
    
