/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    int[] a=new int[100];
   // if(head==null)
     // return null;
      //else
       int i=0;
    for(i=0;head!=null;i++)
         {
         a[i]=head.data;
         head=head.next;
        }
    return a[i-n-1];
      

}