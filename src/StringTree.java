import java.util.Scanner;

public class StringTree {

	protected static Node root;
	
	public static void main(String[] args) {
		reader r = new reader();
		r.openFile();
		r.readFile();
		r.closeFile();
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a word to add to the tree");
			String value = scan.nextLine().trim();
			addNode(value);
			System.out.println("Your tree: ");
			stringTreeList(root);
		}
	}
	
	protected static void addNode(String newValue) {
		
			if (root == null) {
				root = new Node(newValue);
				return;
			}
			Node root1;
			root1= root;
			while (true) {
			 if (newValue.compareTo(root1.value) < 0) {
				if (root1.left == null) {
					root1.left = new Node(newValue);
					return;
				} else {
					root1 = root1.left;
				}
			} else  {
				if (root1.right == null) {
					root1.right = new Node(newValue);
					return;
				} else {
					root1 = root1.right;
				}

			}

		}
	}

	static boolean Nodeinput(Node root, String value) {
		if (root == null) {
			return false;
		} else if (value.equals(root.value)) {
			return true;
		} else if (value.compareTo(root.value) < 0) {
			return Nodeinput(root.left, value);
		} else {
			return Nodeinput(root.right, value);
		}
	}

	protected static void stringTreeList(Node node) {
		if (node != null) {
			stringTreeList(node.left);
			System.out.println(" " + node.value);
			stringTreeList(node.right);
		}

	
	}
}
