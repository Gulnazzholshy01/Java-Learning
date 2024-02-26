class Program{
	public static void main(String[] args){

		int x = 1;
		int y = 4;
		if(x == 1){
			for(int i = 0; i < 3; i++){
				x++;
			}
			if(x == 4){
				System.out.println("x is now 4");
			}else{
				System.out.println("x is not 4");
			}
		}
	}
}