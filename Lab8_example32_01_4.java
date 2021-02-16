import java.util.Scanner;
public class example32_01_4 {//ПРИМЕР 4 РАЗДЕЛ 1 ФАКТОРИАЛ
	public static int fact(int n) { //метод вычисления факториала рекурсией
		int result;
		if (n==1) return 1;
		else{ result=fact(n-1)*n; return result; }
		}
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Вычислить факториал числа n с использованием рекурсии.");
			System.out.println("Введите число для вычисления факториала:");
			int n=in.nextInt();
	        System.out.printf("Факториал числа "+n+"!="+fact(n));  
		}
	}