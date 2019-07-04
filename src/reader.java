import java.io.File;
import java.util.*;

public class reader extends StringTree {
	private Scanner x;
	public void openFile() {
		try {
		x = new Scanner(new File("readme"));
		}
		catch(Exception e) {
			System.out.print("files does not exist");
		}
	}
	public void readFile(){
		while(x.hasNext()) {
			String value = x.nextLine().trim();
			addNode(value);
			stringTreeList(root);
		
			
			//System.out.printf("%s\n", value);
		}
	}
		public void closeFile() {
			x.close();
	}
}

