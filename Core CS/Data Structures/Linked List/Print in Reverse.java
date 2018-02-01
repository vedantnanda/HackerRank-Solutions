void ReversePrint(Node head) 
{
  
    Node temp1;
    Node temp2=null;
    while(head!=null)
        {
        temp1=head.next;
        head.next=temp2;
        temp2=head;
        head=temp1;
    }
    while(temp2!=null)
        {
        System.out.println(temp2.data);
        temp2=temp2.next;
    }
}