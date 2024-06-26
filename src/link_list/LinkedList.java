package link_list;



public class LinkedList {
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    private int size;

    public void addLast(int item)
    {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else{
            last.next = last;
            last = node;
        }
        size++;
    }

    private boolean isEmpty(){

        return first == null;
    }


    public void addFirst(int item){

        var node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){

        int index = 0;
        var current = first;

        while(current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }

        return  -1;
    }



}
