import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(bf.readLine());
		String a[] = new String[n];
		String b[] = new String[n];
		int i;
		for (i = 0; i < n; i++)
			a[i] = bf.readLine();
		a[0] = "janu";
		System.arraycopy(a, 0, b, 0, a.length);
		for (String str : b)
			System.out.print(str + " ");
	}

}
