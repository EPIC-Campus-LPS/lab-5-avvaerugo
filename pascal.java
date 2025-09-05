package lab5;

public class pascal {
	public static void main(String[] args) {
		int n = 5;
		String tri = "1 ";
		String newtri;
		String currentnum = "";
		int prevnum;
		System.out.println("1");
		for (int i = 0; i < n; i++) {
			newtri = "1 ";
			prevnum = 0;
			for (int j = 0; j < tri.length(); j++) {
				char c = tri.charAt(j);
		    	if (c == ((char) 32)) {
		    		newtri = newtri + (Integer.parseInt(currentnum) + prevnum) + " ";
		    		prevnum = Integer.parseInt(currentnum);
		    		currentnum = "";
		    	} else {
		    		currentnum += c;
		    	}
			}
			tri = newtri;
			System.out.println(tri);
		}
	}
}
