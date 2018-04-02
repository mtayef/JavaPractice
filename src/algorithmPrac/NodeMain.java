package algorithmPrac;

public class NodeMain {

	public static void main(String[] args) {
		Node n = new Node(10);
		n.insert(20);
		n.insert(9);
		n.insert(5);
		n.insert(25);
		n.printInOrder();		
	}

}
