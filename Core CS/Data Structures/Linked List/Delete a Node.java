/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int pos) 
{
    if(head==null)
        return head;
    if(pos==0)
            {
            head=head.next;
            return head;
            }
    else
        {
            Node temp=head;
            Node temp1=head;
            int c=0;
            for(int i=1;i<pos;i++)
                {
                temp=temp.next;
                }
            for(int i=0;(i<=pos);i++)
                {
                if(temp1.next==null)
                {c=1;break;}
                temp1=temp1.next;
                }
           if(temp1.next==null && c==1)
                temp.next=null;
           else
                temp.next=temp1;
        }
    return head;
}
