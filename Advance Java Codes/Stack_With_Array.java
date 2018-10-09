import java.util.Scanner;

class Stack_With_Array {
	private static int[] stack;
	private static int head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reading = new Scanner(System.in);
		
		int size = Integer.parseInt(reading.nextLine());
		criaPilha(size);
		String operations;
		operations = reading.nextLine();
		
		while(!(operations.equals("end"))) {
			if(operations.equals("peek")) {
				System.out.println(peek());
			} else if( operations.equals("pop")) {
				pop();
			} else if(operations.equals("print")) {
				System.out.print(print());
			} else {
				String[] entrada = operations.split(" ");	
				push(Integer.parseInt(entrada[1]));
			}
			operations = reading.nextLine();
		}
	}
	
	public static void criaPilha(int tamanho) {
		stack = new int[tamanho];
		head = -1;
	}
	
	public static boolean isEmpty() {
		return head == -1;
	}
	
	public static boolean isFull() {
		return head == (stack.length-1);
	}
	
	public static String print() {
		if(isEmpty()) {
			return "empty\n" ;
		}
		String content = "";
		for(int i = 0; i <= head; i++) {
			content += stack[i] + " ";
		}
		return content.trim() + "\n";
	}
	
	public static String peek() {
		if(isEmpty()) {
			return "empty";
		}
		String exit = "";
		exit += stack[head];
		return exit;
	}
	
	public static void push(int n) {
		if(isFull()) {
			System.out.println("full");
		} else {
		head++;
		stack[head] = n;
		}
	}
	
	public static void pop() {
		if(isEmpty()) {
			System.out.println("empty");
		} else {
			head--;
		}
	}
	
}
