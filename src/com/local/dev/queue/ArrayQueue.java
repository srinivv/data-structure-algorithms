package com.local.dev.queue;

public class ArrayQueue {
    private int front;
    private int rear;
    int size;
    private int[] array;
    
    public ArrayQueue(int size) {
        this.size = size;
        array = new int[size];
        front = -1;
        rear = -1;
    }
    
	public void enqueue(int e) {
		if ((rear + 1) % size == front) {
			throw new IllegalStateException("Queue is full");
		}

		if (isEmpty()) {
			front++;
			rear++;
			array[rear] = e;
		} else {
			rear = (rear + 1) % size;
			array[rear] = e;
		}
	}
    
	public int dequeue() {
		int e = 0;
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		} else if (front == rear) {
			e = array[front];
			rear = -1;
			front = -1;
		} else {
			e = array[front];
			front = (front + 1) % size;
		}
		return e;
	}

	public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }
}
