
public  class  TestRandom {
	public static void main(String[]  args) {
    int N = Integer.parseInt(args [0]); 
	double greaterHalf = 0;
    double lessEqualHalf = 0;
    
    for (int i = 0; i < N; i++) {
    double randomVal = Math.random();
	
    
	if (randomVal <= 0.5)  {
    lessEqualHalf++ ;
		
	} else {
    greaterHalf++;
	}
}

	System.out.println("> 0.5:" +" "+ greaterHalf + " " +"times");
	System.out.println("<= 0.5:" +" "+ lessEqualHalf + " " +"times");
    
	
	if (lessEqualHalf != 0 && greaterHalf != 0) {
	double ratio = (lessEqualHalf/greaterHalf);
    System.out.println("Ratio:" +" "+ ratio);
	}
    else {
    System.out.println("  ");
	}

	}



	}
 



	
