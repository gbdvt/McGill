package comp250;

public class RecommendedExercise {
	public static void getIntersectionSize(int a[], int b[]) {
		int size=0;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {
				if (a[i]==b[j]) {
					size++;
				}
			}
	}
}
