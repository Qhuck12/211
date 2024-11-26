import java.util.ArrayList;

public class EscapeView {
	public void printDescription(String s){
		System.out.println(s);
	}
	public void printOptions(ArrayList<String> s) {
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
	}
	public void printProcess(String s) {
		System.out.println(s);
	}
}
