public class DLL{
    Node head;
    Node tail;
    public DLL(){
        this.head=null;
        this.tail=null;
    }
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public void insertFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void insertLast(int data){
        Node newNode=new Node(data);
        if(tail==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;//tail of prev-->newNode;
            newNode.prev=tail;
            tail=newNode;

        }
    }
    public void printForward(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
        }else{
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    public void printLast(){
        Node current=tail;
        if(tail==null){
            System.out.println("List is empty");

        }else{
            while(current!=null){
                System.out.println(current.data);
                current=current.prev;
            }
        }

    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            head=head.next;//updating first to second
            head.prev=null;//deleting first
        }
    }
    public void deleteLast(){
        if(tail==null){
            System.out.print("list is empty");

        }
        if(head==tail){
            tail=null;
            head=null;
        }else{
            tail=tail.prev;//update tail value from last to second last;
            tail.next=null;//delete the last value;

        }
    }
    public static void main(String[] args){
        DLL dl=new DLL();
        dl.insertFirst(2);
        dl.insertFirst(1);
        dl.insertLast(3);
        dl.insertLast(4);
        dl.insertLast(5);
        System.out.println("forward: ");
        dl.printForward();
        System.out.println("Backward");
        dl.printLast();
        dl.deleteFirst();
        dl.deleteLast();
        System.out.println("After deletion");
        dl.printForward();

    }
    

    }
