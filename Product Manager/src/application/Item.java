package application;

public class Item {
	
	private String itemname;
	private int itemprice;
	public Item(String itemname, int itemprice) {
		super();
		this.itemname = itemname;
		this.itemprice = itemprice;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getItemprice() {
		return itemprice;
	}
	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}

}
