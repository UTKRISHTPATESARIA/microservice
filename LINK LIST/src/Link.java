import java.util.*;

public class Link {

	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int a)
		{
			data=a;
		}
	}
	
	static void traversal(Node l)
	{
		while(l!=null)
		{
			System.out.println(l.data);
			l=l.next;
		}
	}
	/*
	static void createNode(Node head,int data)
	{
		Node n=new Node(data);
		
		while(head.next!=null)
		{
			head=head.next;
		}
		head.next=n;
		
	}
	*/
	
	public static void main(String args[])
	{
		Link list=new Link();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		list.head.next=second;
		second.next=third;
		Node ptr=third;
		
		System.out.println("Enter the nodes");
		int n=Integer.parseInt(readLine());
		
		for(int i=0;i<n;i++)
		{
			Node n1=new Node(i+4);
			ptr.next=n1;
			ptr=n1;
		}
		
		traversal(list.head);
	}
}
