/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int x) 
{
    Node in=new Node();
    Node head1=head;
    if(head==null)
        {
        head=in;
        head.data=x;
        head1=head;
    }
    else
        {
        while(head.next!=null)
            {
            head=head.next;
        }
        head.next=in;
        head=head.next;;
        head.data=x;
    }
  return head1;
}