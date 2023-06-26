package com.lightshoes.enjong.bridge;

import com.lightshoes.enjong.bridge.impl.ArrayListImpl;
import com.lightshoes.enjong.bridge.impl.LinkedListImpl;
import com.lightshoes.enjong.bridge.list.List;
import com.lightshoes.enjong.bridge.list.Queue;
import com.lightshoes.enjong.bridge.list.Stack;

public class BridgeTest {

    public static void main(String[] args) {

        Queue<String> stringQueue = new Queue<>(new ArrayListImpl<>());

        stringQueue.enQueue("A");
        stringQueue.enQueue("B");
        stringQueue.enQueue("C");

        System.out.println(stringQueue.deQueue());
        System.out.println(stringQueue.deQueue());
        System.out.println(stringQueue.deQueue());
        System.out.println(stringQueue.deQueue());

        Stack<String> stringStack = new Stack<>(new LinkedListImpl<>());
        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        System.out.println(stringStack.peek());
        System.out.println(stringStack.peek());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
    }
}
