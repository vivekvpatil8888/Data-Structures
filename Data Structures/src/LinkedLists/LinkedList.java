package LinkedLists;

public class LinkedList 
{ 
    Node head;
    
    static class Node {
        
        Node next;
        int data;
        
        Node ( int data ) {
            
            this.data = data;    
            next = null;
        }
    }
    
    
    // INSERTING AT THE FRONT
    public void push ( int data ) {
        
        Node new_node = new Node(data);
        
        new_node.next = head;
        
        head = new_node;
        
    }
    
    // INSERTING AT A GIVEN POSITION
    public void insertAfter ( Node prev_node, int new_data )
    {
        if( prev_node == null) {
            
         System.out.println("The given previous node doest not exist");
         return;
         
        }
        
        Node new_node = new Node( new_data );
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    
    public void printList() {
        
        Node n = head;
        
        while(n != null) {
            
            System.out.print("[" + n.data + "]->");
            
            n = n.next;
                
        }
    }
    
    public static void main(String[] args) 
    { 
        LinkedList ls = new LinkedList();
        
        ls.head = new Node(1);
        
        Node second = new Node(2);
        
        Node third = new Node(3);
        
        ls.head.next = second;
        
        second.next = third;
        
        ls.push(0);
        
        ls.printList();
    }
}
