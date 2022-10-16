package org.example;
/**
 * Node class
 */
public class Node {
    /**
     * value is a stored node value
     */
    private int value;
    /**
     * previous is a previous node of list
     */
    private Node previous;
    /**
     * next is a next node of list
     */
    private Node next;
    public Node(int n ,Node previous, Node next )
    {
        this.value = n;
        this.previous = previous;
        this.next = next;
    }
    /**
     * method returns value of node
     * @return value
     */
    public int getValue()
    {
        return value;
    }
    /**
     * method returns previous node
     * @return previous node
     */
    public Node getPrevious()
    {
        return previous;
    }
    /**
     * method returns next node
     * @return next node
     */
    public Node getNext()
    {
        return next;
    }
    /**
     * method set value of node
     * @param n new value of node
     */
    public void setValue(int n)
    {
        this.value = n;
    }
    /**
     * method set previous node
     * @param previous new previous node
     */
    public void setPrevious(Node previous)
    {
        this.previous = previous;
    }
    /**
     * method set next node
     * @param next new next node
     */
    public void setNext(Node next)
    {
        this.next = next;
    }
}
