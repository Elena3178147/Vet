package practic;

import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите 1, если у вас собака; введите 2, если у вас кот");
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

	
	

