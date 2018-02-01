/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) 
{
    int i=0;
    if(headA==null && headB==null)
       return 1;
    else{
     while(headA!=null && headB!=null)
         {
         if(headA.data==headB.data)
             {
             i=0;
         }
         else
             i=1;
         headA=headA.next;
         headB=headB.next;
         if((headA==null && headB!=null) || (headA!=null && headB==null))
             i=1;
     }
    if(i==0)
        return 1;
    else
        return (0);
    }
}