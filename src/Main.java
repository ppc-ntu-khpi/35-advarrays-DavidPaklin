import java.util.Arrays;

public class Main {
	public static int sumMatrix(int[][] matrix) {
		// створюємо потік з рядків матриці, зливаємо всі рядки в один потік примітивів int та обчислюємо суму
		return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
	}
}