package linkedlist;

public class add {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addElementAtstart(int data) {
        // adding element at the first

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addElementAtEnd(int data) {
        // add element at last
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void addAtMiddle(int index, int data) {
        if (index == 0) {
            addElementAtstart(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void removeElementAtFirst() {
        Node temp = head;
        if (head == null) {
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = temp.next;
        temp.next = null;
        size--;

    }

    public void removeElementAtLast() {
        Node temp = head;
        if (head == null) {
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;

    }

    public int search(int data) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int Recursearch(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = Recursearch(head.next, key);
        if (indx != -1) {
            indx = indx + 1;
        }
        return indx;

    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteFromNthEndNode(int n) {
        if (n == size) {
            head = head.next;
            return;
        }
        Node prev = head;
        int sz = size - n;
        int i = 1;
        while (i < sz) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node mid() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node middleElement = mid();

        Node curr = middleElement;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data == right.data) {
                left = left.next;
                right = right.next;

            } else {
                return false;
            }
        }
        return true;
    }

    public boolean iscycle() {// floys cycle detection algorithm
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                slow = head;
                Node prev = null;
                while (slow != fast) {
                    slow = slow.next;
                    prev = fast;
                    fast = fast.next;
                }
                prev.next = null;
                return;
            }
        }
    }

    private Node midll(Node head) {
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;

    }

    private Node merge(Node head, Node righthead) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while (head != null && righthead != null) {
            if (head.data <= righthead.data) {
                temp.next = head;
                head = head.next;
                temp = temp.next;
            } else {
                temp.next = righthead;
                righthead = righthead.next;
                temp = temp.next;

            }

        }
        while (head != null) {
            temp.next = head;
            head = head.next;
            temp = temp.next;

        }
        while (righthead != null) {
            temp.next = righthead;
            righthead = righthead.next;
            temp = temp.next;

        }

        return mergedll.next;
    }

    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node mid = midll(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node first = mergeSort(rightHead);
        Node second = mergeSort(head);

        return merge(first, second);

    }

    public void zigzag(Node head) {
        Node mid = midll(head);
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (left != null && right != null) {
            Node leftNext = left.next;
            Node rightNext = right.next;
            left.next = right;
            if (leftNext == null) {
                break;
            }
            right.next = leftNext;
            left = leftNext;
            right = rightNext;
        }
    }

    public static void main(String[] args) {
        add l1 = new add();
        // add.head = new Node(1);
        // Node temp = new Node(2);
        // add.head.next = temp;
        // add.head.next.next = new Node(3);
        // add.head.next.next.next = temp;

        // System.out.println(l1.iscycle());
        // l1.removeCycle();
        // l1.print();
        l1.addElementAtstart(5);
        l1.addElementAtstart(4);
        l1.addElementAtstart(3);
        l1.addElementAtstart(2);
        l1.addElementAtstart(1);
        l1.addElementAtstart(11);


        // l1.print();
        // head = l1.mergeSort(head);
        // l1.print();
        l1.zigzag(head);
        l1.print();

        // Node res=l1.mid();
        // System.out.println(res.data);
        // System.out.println();
        // System.out.println(add.size);

        // l1.removeElementAtFirst();
        // l1.removeElementAtLast();
        // l1.print();
        // System.out.println();
        // System.out.println(l1.Recursearch(head,9));
        // l1.reverse();
        // l1.print();
        // l1.deleteFromNthEndNode(2);
        // System.out.println(l1.isPalindrome());

    }

}
