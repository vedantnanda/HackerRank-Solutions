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

Node SortedInsert(Node head,int data) 
{
  Node in=new Node();
    Node temp=in;
    temp.data=data;
    if(head==null)
        return temp;
    else
        {
        Node x1=head;
        Node x2=head.next;
        if(x2==null)
            {
            if(x1.data>data)
                {
                temp.next=x1;
                x1.prev=temp;
            }
            else
                {
            x1.next=temp;
            temp.prev=x1;
            }
            }
        else
            {
                while(x1!=null )
                    {
                    if(x2!=null && x1.data<data && x2.data>data )
                        {
                        x1.next=temp;
                        temp.prev=x1;
                        temp.next=x2;
                        x2.prev=temp;
                        return head;
                        }
                        else if(x2==null)
                            {
                               x1.next=temp;
                               temp.prev=x1;
                               return head;
                            }
                    x1=x1.next;
                    x2=x2.next;
                }
            }
        return head;
    }
}