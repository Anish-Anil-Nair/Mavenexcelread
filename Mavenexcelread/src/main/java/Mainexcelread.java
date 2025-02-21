import java.io.IOException;

public class Mainexcelread {

	public static void main(String[] args)throws IOException {
		String s=Exceldataread.readStringData(3,1);
		System.out.println(s);
		String s1=Exceldataread.readIntegerData(3,0); // Value passed
		System.out.println(s1);
		}

}
