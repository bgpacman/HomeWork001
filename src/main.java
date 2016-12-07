import java.util.Scanner;

public class main {
	/*
	 * �������� ������ ����� �������� �� Java, ����� �� ������� �� ������
	 * ������� �����: Hello World! This is my first program!
	 */
	public static void task1() {

		System.out.println("Hello World! This is my first program!");

	}

	/*
	 * �������� ��������, ����� ���� �� ��������� 2 ����� �� ��� int � ���������
	 * ������� ����.
	 */
	public static void task2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert first number");
		int firstNum = sc.nextInt();
		System.out.println("Insert second number");
		int secondNum = sc.nextInt();
		int sum = firstNum + secondNum;
		System.out.println("Sum of numbers is: " + sum);

	}

	/*
	 * �������� ��������, ����� ������ ��� ���� ����� - ��������� �������� �
	 * ���������� �� ����������. ����������� ������ �� ������� ���������� � �
	 * �������� �� ���������.
	 */
	public static void task3(int a, int h) {
		int face = (a * h) / 2;
		System.out.print("Face is: " + face);

	}

	/*
	 * �������� �������� ����� ������ 2 ����������� ����� �� ���� � �������
	 * �������� �� ��������� �� �������.
	 */
	public static void task4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insert dividend ");
		int dividend = sc.nextInt();
		System.out.print("Insert divisor ");
		int divisor = sc.nextInt();
		int remainder = dividend % divisor;
		System.out.print("remainder of division is: " + remainder);

	}

	/*
	 * �������� ��������, ����� ������ 2 �������� ���� (string) ���� ����, �
	 * �������� ���� �������� ������������ string ��� �_� ����� ����� ������
	 * ����.
	 */
	public static void task5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert string1 ");
		String niz1 = sc.nextLine();
		System.out.print("Insert string2 ");
		String niz2 = sc.nextLine();
		System.out.println(niz1 + "_" + niz2);

	}

	/*
	 * �������� ��������, ����� ������ ������ ����� ���� ����, � ������� ��
	 * ��������� ��������� �� ��������� �� � ���� �����.
	 */
	public static void task6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insert real number ");
		float dividend = sc.nextFloat();
		System.out.print("Insert divisor ");
		int divisor = sc.nextInt();
		float result = dividend / divisor;
		System.out.print("Result: " + result);

	}

	// �������� ��������, ����� ������ ��� ������� ���� ����. ���� ����
	// ��������� ���� 2��� ������ �� ������� � 1���. �������� ��������� ��
	// ���������� �� ���������
	public static void task7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert string1 ");
		String niz1 = sc.nextLine();
		System.out.print("Insert string2 ");
		String niz2 = sc.nextLine();
		Boolean result = niz1.contains(niz2);
		System.out.println(result);

	}

	/*
	 * �������� ��������, ����� ������ ������ �� ���������, � ������� N-���
	 * ������ �� �������, ���� ��������. *
	 */
	public static void task8(int index) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert string ");
		String niz1 = sc.nextLine();
		char indexS = niz1.charAt(index);
		System.out.print("Symbol number  " + index + " of string is: " + indexS);

	}

	/*
	 * �������� ����� �����, ����� �� ��������� ���� ����� ��� �� �������
	 * (String) � ����� �� �Hello�. ����������� � ��������� ��������� ��
	 * ����������. *
	 */
	public static void task9() {
		String string = "Hello";
		String string1 = "HelloWorld";

		System.out.println("string equals to Hello:" + string.equals("Hello"));
		System.out.println("string1 equals to Hello:" + string1.equals("Hello"));

	}

	public static void main(String[] args) {

		task1();
		task2();
		task3(5, 6);
		task4();
		task5();
		task6();
		task7();
		task8(2);
		task9();

	}

}