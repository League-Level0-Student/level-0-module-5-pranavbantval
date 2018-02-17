
public class ForLoopGauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
	//	System.out.println(i);
	}
	for (int j = 100; j > -1; j--) {
		//System.out.println(j);
	}
	for (int k = 2; k < 102; k++) {
		if(k%2==0) {
			//System.out.println(k);
		}
	}
	for (int l = 1; l < 101; l++) {
		if(l%2==1) {
		//	System.out.println(l);
		}
	}
	for (int m = 0; m < 501; m++) {
		if(m%2==0) {
	//		System.out.println(m+ " is even");
		}
		else if(m%2==1) {
		//	System.out.println(m + " is odd");
		}
	}
	for (int n = 0; n < 784; n++) {
		if(n%7==0) {
	//		System.out.println(n);
		}
	}
	//int a = 2006;
	for (int o = 1; o < 13; o++) {
	//	System.out.println("In " +a+ " I was " + o);
	//	a++;
	}

	for (int p = 0; p < 3; p++) {
		
		for (int q = 0; q < 3; q++) {
			
		
	//	System.out.println( p+" "+q);
	}//q
}//p
/*for (int r = 1; r < 4; r++) {
	
	for (int s = 1; s < 4; s++) {
		if(r==1) {
		System.out.print(s);
		}
		else if(r==2) {
			System.out.print(s+3);
		}
		else if(r==3) {
			System.out.print(s+6);
		}
			
	}
	System.out.print("\n");
}*/
	
for (int b = 0; b < 10; b++) {
	for (int c = 1; c < 10; c++) {
		if(b==0) {
		System.out.print(c + " ");
	}
		else if(b==1) {
			System.out.print(c+10 + " ");
		}
		else if(b==2) {
			System.out.print(c+20 + " ");
		}
		else if(b==3) {
			System.out.print(c+30 + " ");
		}
		else if(b==4) {
			System.out.print(c+40 + " ");
		}
		else if(b==5) {
			System.out.print(c+50 + " ");
		}
}
	System.out.print("\n");
}
}
}