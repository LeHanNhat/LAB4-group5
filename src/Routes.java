public class Routes {
    private String Route_ID;
	private double Distance;
	private double duration;
	private String Route_Status;
	
	public Routes(String route_ID, double distance, double duration, String route_Status) {
		super();
		Route_ID = route_ID;
		Distance = distance;
		this.duration = duration;
		Route_Status = route_Status;
	}
	
	public String getRoute_ID() {
		return Route_ID;
	}

	public void setRoute_ID(String route_ID) {
		Route_ID = route_ID;
	}

	public double getDistance() {
		return Distance;
	}

	public void setDistance(double distance) {
		Distance = distance;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getRoute_Status() {
		return Route_Status;
	}

	public void setRoute_Status(String route_Status) {
		Route_Status = route_Status;
	}

	public void AddRoute() {
	
	}
	public void DeleteRoute() {
		
	}
	public void UpdateRoute() {
		
	}
}
