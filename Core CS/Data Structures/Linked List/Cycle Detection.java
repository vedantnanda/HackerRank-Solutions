/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) 
{
    if(head==null)
        return false;
    else
        {
        Node slow=head,fast=head;
        while(true)
            {
            slow=slow.next;
            
            if(fast.next.next!=null)
            fast = fast.next.next; 
            else
            return false; 
            
            if(slow == null || fast == null)
            return false;

            if(slow == fast)
            return true;
        }
    }
}