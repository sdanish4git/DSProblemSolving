package util;

public interface ArrayUtil {
	public static void printArray(int a[]) {
		System.out.println("##############");
		for(int e:a) {
			System.out.print(e+" ");
		}
		System.out.println("###############");
	}
}
