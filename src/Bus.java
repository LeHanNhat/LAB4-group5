public class Bus {
    private String Bus_ID;
	private String Model;
	private int seating_capacity;
	private int standing_capacity;
	public BUS(String bus_ID, String model, int seating_capacity, int standing_capacity) {
		super();
		this.Bus_ID = bus_ID;
		this.Model = model;
		this.seating_capacity = seating_capacity;
		this.standing_capacity = standing_capacity;
	}
	public void addBus() {
		
	}
	public void DeleteBus() {
		
	}
	public void UpdateBus() {
		
	}
	public String getBus_ID() {
		return Bus_ID;
	}
	public void setBus_ID(String bus_ID) {
		Bus_ID = bus_ID;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getSeating_capacity() {
		return seating_capacity;
	}
	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}
	public int getStanding_capacity() {
		return standing_capacity;
	}
	public void setStanding_capacity(int standing_capacity) {
		this.standing_capacity = standing_capacity;
	}
	
}
