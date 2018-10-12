import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		Scanner input = new Scanner(System.in);
		String operations = input.nextLine();
		
		
		
		while(!(operations.equals("end"))) {
			if(operations.equals("print")) {
				System.out.println(queue.print());
			} else if(operations.equals("remove")) {
				queue.remove();
			} else if(operations.equals("element")) {
				System.out.println(queue.element());
			} else {
				String[] entrada = operations.split(" ");
				if(entrada[0].equals("add")) {
					queue.add(Integer.parseInt(entrada[1]));
				} else {
					System.out.println(queue.search(Integer.parseInt(entrada[1])));
				}
			}
			operations = input.nextLine();
		}
		
	}
}

class Queue{
	Node head;
	int size;
	
	public Queue() {
		this.head = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	public void add(int v) {
		if(isEmpty()) {
		  Node newNode = new Node(v);
		  head = newNode;
		  size++;
		} else {
			add(head,  v);
		}
	}

	private void add(Node node, int v) {
		// TODO Auto-generated method stub
		Node aux = new Node(v);
		if(node.next == null) {
			node.next = aux;
			aux.prev = node;
			size++;
		} else {
			add(node.next, v);
		}
	}
	
	public void remove() {
		if(isEmpty()) {
			System.out.println("empty");
		} else {
			if(head.next == null) {
				head = null;
				size = 0;
			} else {
				Node aux = this.head.next;
				this.head.next = null;
				this.head.prev = null;
				this.head = aux;
				size--;
			}
			
		}
	}

	public String print() {
		if(isEmpty()) {
			return "empty";
		} else {
			return print(head).trim();
		}
	}

	private String print(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return "";
		}
		return node.toString() + " " + print(node.next);
	}

	public String element() {
		return head.toString();
	}
	
	public int search(int v) {
		int search = search(head, v);
		if(search > size) {
			return -1;
		}
		return search;
	}

	private int search(Node node, int v) {
		// TODO Auto-generated method stub
		if(node == null) {
			return 1;
		}
		if(node.getValor() == v) {
			return 0;
		}
		return 1 + search(node.next, v);
		
		
	}
	
}


class Node{
	
	Node next;
	Node prev;
	int val;
	
	public Node(int v) {
		this.val = v;
		this.next = null;
		this.prev = null;
	}
	
	public String toString() {
		return "" + val;
	}
	public int getValor() {
		return this.val;
	}
}