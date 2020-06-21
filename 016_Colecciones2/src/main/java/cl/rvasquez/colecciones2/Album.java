package cl.rvasquez.colecciones2;

public class Album {
	private String userId;
	private int id;
	private String title;
	
	Album(String userId, int id, String title){
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
	}
	Album(){}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Album [userId=" + userId + ", id=" + id + ", title=" + title + "]";
	}
}
