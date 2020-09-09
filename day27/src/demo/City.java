package demo;

public class City {
	private String city;
	private String sheng;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(String city, String sheng) {
		super();
		this.city = city;
		this.sheng = sheng;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the sheng
	 */
	public String getSheng() {
		return sheng;
	}
	/**
	 * @param sheng the sheng to set
	 */
	public void setSheng(String sheng) {
		this.sheng = sheng;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [city=" + city + ", sheng=" + sheng + "]";
	}
	
	
	

}
