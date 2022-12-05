package main;

import java.util.Scanner;

public class sus {
	
		public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Миша нубас? Варианты ответов: да/нет ");

if (scan.hasNext("да")) {
    String cum = scan.nextLine();
    System.out.println("Это правильный ответ");
} else {
    System.out.println("Извините, но это явно неправильно. Перезапустите программу и попробуйте снова!");
}

System.out.println("Сетт имба? ");

Scanner scan1 = new Scanner(System.in);
if (scan1.hasNext("да")) {
    String cum = scan1.nextLine();
    System.out.println("Это правильный ответ");
} else {
    System.out.println("Извините, но это явно неправильно. Перезапустите программу и попробуйте снова!");
}

}
}