package USERS;

public class Head_dept {
 private String dept_Id;
 private String dept_name;
 private String Event;
 private String participants;
// private List<String> participants;
 public Head_dept() {
     // Không thực hiện gì cả trong constructor rỗng này
 }

 // Constructor với tham số
 public Head_dept(String dept_Id, String dept_name, String Event, String participants) {
     this.dept_Id = dept_Id;
     this.dept_name = dept_name;
     this.Event = Event;
     this.participants = participants;
 }
 
 public String getDept_Id() {
	return dept_Id;
}

public void setDept_Id(String dept_Id) {
	this.dept_Id = dept_Id;
}

public String getDept_name() {
	return dept_name;
}

public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}

public String getEvent() {
	return Event;
}

public void setEvent(String event) {
	Event = event;
}

public String getParticipants() {
	return participants;
}

public void setParticipants(String participants) {
	this.participants = participants;
}

public void ListEvent() {
	 
 }
 public void CreateBooking() {
	 
 }
 public void DeleteBooking() {
	 
 }
 public void UpdateParticipants() {
	 
 }
 public void UpdateEvent() {
	 
 }
}
