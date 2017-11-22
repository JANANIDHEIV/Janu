import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMedian {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Size of first array");
		int m = Integer.valueOf(bf.readLine());
		System.out.println("Size of second array");
		int n = Integer.valueOf(bf.readLine());
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		int arr3[] = new int[m + n];
		int i = 0, k = 0;
		int j = 0;
		float med = 0.0f;
		System.out.println("Elements of first array ");
		for (i = 0; i < m; i++)
			arr1[i] = Integer.valueOf(bf.readLine());
		System.out.println("Elements of second array ");
		for (i = 0; i < n; i++)
			arr2[i] = Integer.valueOf(bf.readLine());
		i = 0;
		j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i];
				i++;
			} else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < m) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while (j < n) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}

		if (k % 2 != 0) {
			med = arr3[k / 2];
		} else {

			float sum = arr3[k / 2] + arr3[k / 2 - 1];

			med = sum / 2;

		}
		System.out.println("Median : " + med);
	}

}
