class Oblig1{
	public static void main(String[] args) {
		

		Regneklynge abel = new Regneklynge(12);
		
		for (int i = 0; i <650; i++){
			Node ny = new Node (64, 2.6, 8, 2.6, 8);
			abel.SettInnNode(ny);
		}
		
		for (int i = 0; i < 16; i++){
			Node ny = new Node (1024, 2.3, 8, 2.3,8);
			abel.SettInnNode(ny);
		}
		
		System.out.println("--------");
		
		System.out.println("Max FLOPS: " +abel.flops());

	}
}