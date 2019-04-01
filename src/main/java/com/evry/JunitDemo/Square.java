package com.evry.JunitDemo;

public class Square {

	static int countSquares(int a, int b) 
    { 
        int cnt = 0; // Initialize result 
  
        // Traverse through all numbers 
        for (int i = a; i <= b; i++) 
  
            // Check if current number 'i' is perfect 
            // square 
            for (int j = 1; j * j <= i; j++) 
                if (j * j == i) 
                    cnt++; 
        return cnt; 
    } 

	
	/*public int square(int temp[] )
	{
		
	int [] temp1 = {0, 1, 2, 3, 4, 5};
	int i;

    for ( i = 0; i < temp1.length; i++) {
        System.out.println(temp1[i] + "\t" + (int)Math.pow(temp1[i], 2));
    }
	return temp1[i];
}*/
	public static void main(String[] args) {
		
		int a = 9, b = 25; 
        Square s = new Square(); 
        System.out.print("number squares is " + s.countSquares(a, b));
	}
}
