/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {

    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        //Adding 5 Students by hard-coding
        //The Queue enqueues them according to ascending Roll Number as given for example in Problem Statement
        myPriorityQueue.enqueue(new Node(new Student("A",1)));
        myPriorityQueue.enqueue(new Node(new Student("B",2)));
        myPriorityQueue.enqueue(new Node(new Student("C",3)));
        myPriorityQueue.enqueue(new Node(new Student("D",4)));
        myPriorityQueue.enqueue(new Node(new Student("E",5)));
        myPriorityQueue.printQueue();
    }
}
