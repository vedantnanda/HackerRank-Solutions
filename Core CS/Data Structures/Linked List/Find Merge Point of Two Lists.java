/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) 
{
    if(headA==null || headB==null)
        return 0;
    while(headA!=null && headB!=null)
        {
        Node temp=headB;
        while(temp!=null)
            {
            if(headA.data==temp.data)
                return temp.data;
                else
                temp=temp.next;
        }
        headA=headA.next;
        headB=headB.next;
    }
    return 0;
}