import java.util.Scanner;
import java.util.Random;
public class example32_08 {
	//статический метод дл€ расчета среднего значаени€
    static double MidleArr(int arr[]) { 
    	double sum=0;//сумма элементов массива double дл€ выделени€ дробной части
    	for (int j=0; j<arr.length; ++j) {sum=sum+arr[j];}
	return (sum/arr.length);
    }
	public static void main(String[] args) {
try {
	System.out.println("ѕрограмма со статическим методом, аргументом которому передаетс€ целочисленный массив,\n"
			+"результатом возвращаетс€ среднее значение дл€ элементов массива");
	Scanner in = new Scanner(System.in);
	Random rnd = new Random(); // Random дл€ "случайного" заполнени€ исходного массива
	System.out.println("-----------------------------------------------------");	
	System.out.println("—оздадим исходный массив дл€ статического метода, введите размер исходного массива:");
	int size=in.nextInt(); //размер исходного массива
	int[] arr = new int[size]; // —оздание исходного массива 
	System.out.println("»сходный массив создан генератором случайных чисел в диапазоне от 0 до 100:");
	for (int i=0 ; i<arr.length ; i++) {arr[i] = rnd.nextInt(100); // ѕрисвоение i-тому элементу массива случайного значени€
    System.out.print(arr[i]+" ");}
	System.out.println();
	System.out.println("-----------------------------------------------------");
	System.out.printf("—реднее значение элементов массива= %.2f", MidleArr(arr));
}		
catch (Exception error) { System.out.println("ѕри обработке данных произошла ошибка!"); //обработка исключени€
}
	}

}
