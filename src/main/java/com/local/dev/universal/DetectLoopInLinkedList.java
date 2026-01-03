package com.local.dev.universal;

// Detect and remove loop in linked list 

/*
 * Write a function detectAndRemoveLoop() that checks whether a given Linked List contains loop and if loop is present then removes the loop and returns true. If the list doesn’t contain loop then it returns false. Below diagram shows a linked list with a loop. 
 * detectAndRemoveLoop() must change the below list to 1->2->3->4->5->NULL.
 * 
 * 1->2->3
 * 	  ^	 |
 * 	  |	 V
 * 	  5<-4
 * 
 * 
	Before trying to remove the loop, we must detect it. Techniques discussed in the above post can be used to detect loop. To remove loop, all we need to do is to get pointer to the last node of the loop. For example, node with value 5 in the above diagram. Once we have pointer to the last node, we can make the next of this node as NULL and loop is gone. 
	We can easily use Hashing or Visited node techniques (discussed in the above mentioned post) to get the pointer to the last node. Idea is simple: the very first node whose next is already visited (or hashed) is the last node. 
	We can also use Floyd Cycle Detection algorithm to detect and remove the loop. In the Floyd’s algo, the slow and fast pointers meet at a loop node. We can use this loop node to remove cycle. There are following two different ways of removing loop when Floyd’s algorithm is used for Loop detection.

	Method 1 (Check one by one) We know that Floyd’s Cycle detection algorithm terminates when fast and slow pointers meet at a common point. We also know that this common point is one of the loop nodes (2 or 3 or 4 or 5 in the above diagram). Store the address of this in a pointer variable say ptr2. After that start from the head of the Linked List and check for nodes one by one if they are reachable from ptr2. Whenever we find a node that is reachable, we know that this node is the starting node of the loop in Linked List and we can get the pointer to the previous of this node.
	
	Method 2 (Better Solution)  

	This method is also dependent on Floyd’s Cycle detection algorithm.
	Detect Loop using Floyd’s Cycle detection algorithm and get the pointer to a loop node.
	Count the number of nodes in loop. Let the count be k.
	Fix one pointer to the head and another to a kth node from the head.
	Move both pointers at the same pace, they will meet at loop starting node.
	Get a pointer to the last node of the loop and make next of it as NULL.
 */
class DetectLoopInLinkedList {

	static Node head;

	// Function that detects loop in the list
    int detectAndRemoveLoop(Node node)
    {
        Node slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
 
            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }
 
    // Function to remove loop
    void removeLoop(Node loop, Node head)
    {
        Node ptr1 = loop;
        Node ptr2 = loop;
 
        // Count the number of nodes in loop
        int k = 1, i;
        while (ptr1.next != ptr2) {
            ptr1 = ptr1.next;
            k++;
        }
 
        // Fix one pointer to head
        ptr1 = head;
 
        // And the other pointer to k nodes after head
        ptr2 = head;
        for (i = 0; i < k; i++) {
            ptr2 = ptr2.next;
        }
 
        /*  Move both pointers at the same pace,
         they will meet at loop starting node */
        while (ptr2 != ptr1) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
 
        // Get pointer to the last node
        while (ptr2.next != ptr1) {
            ptr2 = ptr2.next;
        }
 
        /* Set the next node of the loop ending node
         to fix the loop */
        ptr2.next = null;
    }
 
    // Function to print the linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
    	DetectLoopInLinkedList list = new DetectLoopInLinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
 
        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
}