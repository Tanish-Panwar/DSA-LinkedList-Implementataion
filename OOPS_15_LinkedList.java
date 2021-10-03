class MyLinkedList<E> {

    // This is a main node, because of this next node connected to it and so on.
    Node<E> head;


    // Add method for adding elements our MyLinkedList Class Object.
    public void add(E data){
        Node<E> element = new Node<E>(data);
        

        // Checking if the head is not initialized and is null.
        if (isEmpty()) {
            head = element;
            return;
        }
        
        // Creating a temp node which is equal to our Head node.
        Node<E> temp = head;
        
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = element;
    }

    // Is empty function for checking if the head is null.
    public boolean isEmpty(){
        return head == null;
    }



    // REMOVE LAST METHOD IMPLEMENTATION 
    public E removeLast() throws Exception{
        Node<E> temp = head;
        if (temp == null) throw new Exception("Illegal Modefication");
        
        if (temp.next == null) {
            Node<E> toRemove = head;
            head = null;
            return toRemove.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }

        Node<E> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }


    // GET INDEX VALUE IMPLEMENTATION
    public E getIndexValue(int index) throws Exception {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;            
        }
        return temp.data;
        
    }



    // GET LAST METHOD IMPLEMENTATION
    public E getLast() throws Exception {
        Node<E> temp = head;
        if (temp == null) throw new Exception("Illegal Modefication");
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }



    // This is a class Node. Which contains "int: data" and A self Object "Node: next".
    public static class Node<E> {
        E data;
        Node<E> next;

        // A constructor for data to be setted to the main "int data" reference. and setting "next to be null".
        public Node(E data) {
            this.data = data;
            next = null;
        }
    }



}