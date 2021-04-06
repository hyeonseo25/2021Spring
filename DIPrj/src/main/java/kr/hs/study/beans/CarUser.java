package kr.hs.study.beans;

public class CarUser {
	private String owner;
	private String color;
	private Car car_type;
	public CarUser() {
		super();
	}
	
	public CarUser(Car car_type) {
		super();testBean5
		this.car_type = car_type;
	}

	public CarUser(String owner, String color) {
		super();
		this.owner = owner;
		this.color = color;
	}
	public CarUser(String owner, String color, Car car_type) {
		super();
		this.owner = owner;
		this.color = color;
		this.car_type = car_type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car getCar_type() {
		return car_type;
	}
	public void setCar_type(Car car_type) {
		this.car_type = car_type;
	}

	@Override
	public String toString() {
		return "CarUser [owner=" + owner + ", color=" + color + ", car_type=" + car_type + "]";
	}

	
	
	
	
}
