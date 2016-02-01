package gehoelz;

public abstract class Gehoelz {
	private String art;
	private int pflanzjahr;
	private float preis;
	
	public Gehoelz(String art, int pflanzjahr, float preis) {
		super();
		this.art = art;
		this.pflanzjahr = pflanzjahr;
		this.preis = preis;
	}
	
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	public int getPflanzjahr() {
		return pflanzjahr;
	}
	public void setPflanzjahr(int pflanzjahr) {
		this.pflanzjahr = pflanzjahr;
	}
	public float getPreis() {
		return preis;
	}
	public void setPreis(float preis) {
		this.preis = preis;
	}

}
