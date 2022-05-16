public class Average {
    // average of the given number
	public static void main(String[] args) {
		int[] number = {99, 105, 144, 720, 950};
		float sum = 0; 
		
		
		for (int num:number) 
			
			sum += num;
			
			
		float average = (sum / number.length);
		
		System.out.println("Average is : "+ average);

	}

}
