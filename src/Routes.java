/**
 * Routes
 */
public class Routes {

    private String routeID;
    private int distance;
    private int duration;
    private String status;

    public Routes(String routeID, int distance, int duration,String status){
        this.routeID = routeID;
        this.distance = distance;
        this.duration = duration;
        this.status = status;
    }

}