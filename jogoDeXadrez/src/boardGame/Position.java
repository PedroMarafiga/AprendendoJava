package boardGame;

public class Position {
	
	private int row;
	private int Collumn;
	public Position(int row, int collumn) {
		this.row = row;
		Collumn = collumn;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCollumn() {
		return Collumn;
	}
	public void setCollumn(int collumn) {
		Collumn = collumn;
	}
	
	@Override
	public String toString() {
		return  row + "," + Collumn ;
	}
	
	
	
}
