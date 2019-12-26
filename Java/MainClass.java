public class MainClass {
	public static void main(String[] args) {
		String s = new String("Hello World").toUpperCase(), sr = new String("");
		int vc = 0, l = s.length();
		for(int i = 0; i < l; i++) {
			char c = s.chatAt(i);
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') { ++vc; }
			sr = "" + c + sr; 
		}
		System.out.println("Reverse String: "+sr+"\tVowel Count: "+vc);
	}
}