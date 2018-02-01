/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) 
{
     if(headA==null)
         return headB;
     else if(headB==null)
         return headA;
     else
         {
            Node n=null,n1=null;
         if(headA.data>headB.data)
         {
             n=headB;
             headB=headB.next;
         }
         else
          {
             n=headA;
             headA=headA.next;
         }
         n1=n;
         while(headA!=null && headB!=null)
             {
             if(headA.data<headB.data)
                 {
                 n.next=headA;
                 headA=headA.next;
                }
             else
                 {
                 n.next=headB;
                 headB=headB.next;
             }
             n=n.next;
         }
         if(headA==null)
             n.next=headB;
         else if(headB==null)
             n.next=headA;
         return n1;
     }
    
}