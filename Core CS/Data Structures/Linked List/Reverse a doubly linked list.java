/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) 
{
    if(head==null)
        return head;
    else if(head.next==null)
        return head;
    else
        {
            Node temp=null;
            Node temp2=head;
            while(temp2!=null)
                {
                temp=temp2.prev;
                temp2.prev=temp2.next;
                temp2.next=temp;
                temp2=temp2.prev;
                
            }
            temp=temp.prev;
            return temp;
        }
       
}