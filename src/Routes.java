public class Routes {
	private String Route_ID;
	private double Distance;
	private double duration;
	private String Route_Status;
	private App_Manager appManager;

	public Routes(String route_ID, double distance, double duration, String route_Status, App_Manager appManager) {
		super();
		Route_ID = route_ID;
		Distance = distance;
		this.duration = duration;
		Route_Status = route_Status;
		this.appManager = appManager;
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
	
		appManager.listRoutes().add(this);
	}

	public void DeleteRoute() {
		
		appManager.listRoutes().remove(this);
	}

	public void UpdateRoute(String route_ID, double distance, double duration, String route_Status,) {
		this.setRoute_ID(route_ID);
        this.setDistance(distance);
		this.setDuration(duration);
		this.setRoute_Status(route_Status);
	}
}
