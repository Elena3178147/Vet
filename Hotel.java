package practic;

import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("������� 1, ���� � ��� ������; ������� 2, ���� � ��� ���");
		 int type = scan.nextInt();
		
        if (type == 1) {
         
    Dog dog = new Dog ();
    dog.Hello();
    dog.show();
    }
        
        else {
        	
    Cat cat = new Cat ();
    cat.Hello();
    cat.show(); 	
    }
           
      
}
}

	
	

