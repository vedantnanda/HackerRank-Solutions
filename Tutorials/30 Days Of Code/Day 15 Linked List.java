    public static  Node insert(Node head,int x) 
    {
      
        if(head==null)
            {
            Node in=new Node(x);
            head=in;
            return head;
        }
        else
            {
            Node temp=head;
            while(temp.next!=null)
            {temp=temp.next;}
            Node in=new Node(x);
            temp.next=in;
            return head;    
        }
        
    }