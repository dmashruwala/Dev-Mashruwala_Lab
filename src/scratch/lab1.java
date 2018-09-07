package scratch;

import java.util.Random;

public class lab1 {

	public static void main(String[] args) {
		Random x = new Random();
		int count = 0;
		for(int i = 0; i <1000; i++) {
			String three = "";
			for(int j=0; j <3; j++) {
				int y = x.nextInt(4);
				if(y == 0) {
					three = three + "A";
				}else {
					if(y == 1) {
						three = three + "T";
					}else {
						if(y == 2) {
							three = three + "G";
						}else {
							if(y == 3) {
								three = three + "C";
							}else {
							}
						}
					}
				}
				
			}
			System.out.println(three);
			if(three.equals("AAA")) {
				count++;
			}
		
		}
		System.out.print(count);
	}

}

