public class Prosessor{
	private double mHz;
	private int kjerner;

	public Prosessor(double mHz, int kjerner){
		this.mHz = mHz;
		this.kjerner = kjerner;
	}

	public double getmHz(){
		return mHz;
	}

	public int getKjerner(){
		return kjerner;
	}


}