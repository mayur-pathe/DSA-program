public class List1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //adding new node in linked list at head position
    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        //if linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //new node store the address of head node
        newNode.next = head;
        //reassigning the head position
        head = newNode;
    }
    //adding new node in linked list at tail position
    public void addLast(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        //if linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //tail node store the address of new node
        tail.next = newNode;
        //reassigning the tail position 
        tail = newNode;
    }
    //method to add node at middle position
    public void add(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //removing node from linked list from head position
    public void removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
        }if(size==1){
            head = tail = null;
            size = 0;
        }
        head = head.next;
        size--;
    }
    //removing node from linked list from tail position
    public void removeLast(){
        if(size ==0){
            System.out.println("ll is empty");
        }if(size ==1){
            head = tail = null;
            size =0;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
    }
    //method to search key in linked list
    public int search(int key){
        int i=0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    //recursive search in linked list
    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    //method to reverse a linked list
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        head = prev;
    }
    //remove the node from the end
    public void remNthfromEnd(int n){
        int sz =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;
            return;
        }
        int i=1;
        int ithprev = sz-n;
        Node prev = head;
        while(i<ithprev){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    //find mid of linked list 
    public Node MidNode(Node head){
        //slow fast approach
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true; 
        }
        //1st step find mid
        Node mid = MidNode(head);
        //2nd step reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head;
        //3rd step check boths half are equal or not
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    //method to print linked list
    public void printll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        List1 ll = new List1();
        
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.printll();
        // System.out.println("size of linked list is : "+ ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.printll();

        // System.out.println("size of linked list is : "+ ll.size);

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.search(10));
        // ll.reverse();
        // ll.printll();
        // ll.remNthfromEnd(3);
        // ll.printll();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.printll();
        System.out.println(ll.checkPalindrome());
    }
}
