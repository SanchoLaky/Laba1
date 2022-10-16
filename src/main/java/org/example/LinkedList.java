package org.example;
/**
 * Container class
 */
public class LinkedList {
    /**
     * the base of a double linked list container
     */
    private Node head;
    private Node tail;
    /**
     * The function of adding an element to the end of the container
     * @param nv item to add
     */
    public void add(int nv)
    {
        if (this.head == null)
        {
            this.head = new Node(nv, null, null);
            this.tail = this.head;
        }
        else
        {
            this.tail.setNext(new Node(nv, this.tail, null));
            this.tail = this.tail.getNext();
        }
    }
    /**
     * The function of adding an element (node) to the end of the container
     * @param nn item to add
     */
    public void add(Node nn)
    {
        if (this.head == null)
        {
            this.head = nn;
            this.tail = this.head;
        }
        else
        {
            this.tail.setNext(nn);
            this.tail.setPrevious(this.tail);
            this.tail = this.tail.getNext();
        }
    }
    /**
     * Method for getting the element value
     * @param ind index of the element to get the value
     * @return node of the element with the given index
     */
    public int get(int ind)
    {
        int i = 0;
        int res = -1;
        Node resElement = this.head ;
        while (i<ind && resElement!=null) {
            resElement = resElement.getNext();
            i++;
        }
        if (i != ind || resElement == null)
        {
            System.out.print("Error! List index out of bounds. Returned -1");
            res = -1;
        }
        else
            res = resElement.getValue();
        return res;
    }
    /**
     * Method of deleting an element
     * @param ind index of the item to delete
     * @return removed node
     */
    public Node remove(int ind)
    {
        int i = 0;
        Node resNode = this.head ;
        while (i<ind && resNode!=null) {
            resNode = resNode.getNext();
            i++;
        }
        if (i == ind && resNode!=null)
        {
            if (i!=0)
            {
                resNode.getPrevious().setNext(resNode.getNext());
                if (resNode.getNext()!= null)
                    resNode.getNext().setPrevious(resNode.getPrevious());
            }
            else
            {
                this.head = this.head.getNext();
                this.head.setPrevious(null);
            }
            resNode.setNext(null);
            resNode.setPrevious(null);
        }
        else
            resNode = null;
        return resNode;
    }
    /**
     * Method for printing all elements of list
     */
    public void printLinkedList ()
    {
        Node idNode = this.head;
        while(idNode!= null)
        {
            System.out.print(idNode.getValue());
            System.out.print(" ");
            idNode=idNode.getNext();
        }
    }
}
