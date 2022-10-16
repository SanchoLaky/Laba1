package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList testList=new LinkedList();
    @BeforeEach
    public void prepareData(){
        testList.add(8);
        testList.add(4);
        testList.add(2);
        testList.add(9);
    }
    @Test
    void testAddValue() {
        testList.add(10);
        assertEquals(10,testList.get(4));
    }

    @Test
    void testAddNode() {
        Node testNode = new Node(10,null,null);
        testList.add(testNode);
        assertEquals(10,testList.get(4));
    }

    @Test
    void testGet() {
        assertEquals(-1,testList.get(4));
        assertEquals(-1,testList.get(-1));
        assertEquals(2,testList.get(2));
    }

    @Test
    void testRemove() {
        Node delNode = testList.remove(2);
        assertEquals(2,delNode.getValue());
        assertEquals(9,testList.get(2));
    }

    @Test
    void testRemoveTwo() {
        Node delNode = testList.remove(5);
        assertEquals(null,delNode);
        delNode = testList.remove(-1);
        assertEquals(null,delNode);
    }

}