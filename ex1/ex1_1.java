class ex1_1{
	public static void main(String [] args){
		long bot = Long.parseLong(args[0]);
		long juc = 0;
		while((bot -= 2) >= 0) juc++;
		System.out.println(juc);
	}
}
		
		
	
