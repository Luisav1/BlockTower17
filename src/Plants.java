
public class Plants extends GameCharacter{
	private int price;
	private int row;
	private int column;
	
	//not final, too many parameters, PLEASE EDIT, perhaps use an interface if possible
	public Plants(String aName, int aHealth, int anAttack, int aPrice, int aRow, int  aColumn) {
		super(aName, aHealth, anAttack);
		this.price = aPrice;
		this.row = aRow; //add if statements
		this.column = aColumn; //add if statements
	}
	
	public Plants(Plants aPlant) {
		super(aPlant);
		this.price = aPlant.price;
		this.row = aPlant.price;
		this.column = aPlant.price;
	}
	
	public String getLocation(){
		return "(" + row + ", " + column + ")";
	}
	public void setRow(int row){
		this.row = row;
	}
	public void setColumn(int column){
		this.column = column;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}

}
