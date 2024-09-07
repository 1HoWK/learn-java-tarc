
public class Tutorial2Q5 {
	
	public static void main (String args[]) {
		
        int sumOfNum = 0;
        int totalSquareNum = 0;
        int squareNum;
        double average;
        double s;
        
        System.out.println("20 random numbers:");
        for (int i = 0; i < 20; i++) { 
            int rand = (int)(Math.random() * 101) ;
            System.out.println(rand);
            squareNum = rand * rand;
            totalSquareNum += squareNum;
            sumOfNum += rand;
        } 
        System.out.println("\nSum of these 20 random numbers: " + sumOfNum);
        average = sumOfNum / 20;
        System.out.println("Average of these 20 random numbers: " + average);
        // standard deviation
        s = Math.sqrt((totalSquareNum - (1/20*(totalSquareNum*totalSquareNum)) / (20-1) ));
        System.out.println("Standard Deviation(s): " + s);
	}
}
