package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(6);
        cq.EnQueue(10);
        cq.EnQueue(20);
        cq.EnQueue(30);
        cq.EnQueue(40);
        cq.EnQueue(50);
        cq.EnQueue(60);
        System.out.println(cq.DeQueue());
        System.out.println(cq.peek());
    }


}