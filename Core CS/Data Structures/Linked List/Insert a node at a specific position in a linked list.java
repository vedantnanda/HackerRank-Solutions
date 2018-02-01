/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int x, int pos) 
{
    Node in=new Node();
    Node temp1=head;
    Node temp2=head;
    if(head==null)
        {
        head=in;
        head.data=x;
        }
    else if(pos==0)
        {
        temp1=in;
        temp1.data=x;
        temp1.next=head;
        head=in;
        }
    else if(pos>=1)
        {
            for(int i=1;i<pos;i++)
                {
                temp1=temp1.next;
            }
        temp2=temp1.next;
        temp1.next=in;
        temp1=in;
        temp1.data=x;
        temp1.next=temp2;
        }
    return head;
}