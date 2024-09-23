public class lab2_2 {
    Node head;
    public lab2_2() {
        this.head = null;      
    }
    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        lab2_2 list = new lab2_2();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List: ");
        list.display();
    }
}
