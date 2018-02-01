/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) 
{
 if(head==null)
     return head;
    else
        {
        Node temp=head;
        while(temp.next!=null)
        {
        if(temp.data==temp.next.data)
            {
            temp.next=temp.next.next;
        }
        else
            {
            temp=temp.next;
        }
        }
        return head;
    }
}