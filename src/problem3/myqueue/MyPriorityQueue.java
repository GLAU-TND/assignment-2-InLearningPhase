/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue {

    private Node rear;
    // a field to refer front end of queue
    private Node front;
    private int size;// total number of elements in the queue

    public MyPriorityQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(Node addData) {
        if (front == null) {
            rear = addData;
            front = addData;
            size++;
        } else {
            if (addData.getData().getRoll() >= this.rear.getData().getRoll()) {
                rear.setNext(addData);
                rear = addData;
                size++;
            } else if (addData.getData().getRoll() <= this.front.getData().getRoll()) {
                addData.setNext(this.front);
                this.front = addData;
                size++;
            } else {
                Node temp = this.front;
                Node tempPrevious = this.front;
                while (temp.getNext() != null) {
                    if (temp.getData().getRoll() > addData.getData().getRoll()) {
                        break;
                    }
                    tempPrevious = temp;
                    temp = temp.getNext();
                }
                tempPrevious.setNext(addData);
                addData.setNext(temp);
                size++;

            }
        }
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        Node temp = this.front;
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                System.out.print(temp.getData().toString() + "--->");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getData().toString());
            }
        }
    }

}
