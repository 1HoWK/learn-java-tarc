package practical4;

public class Cars {
	private int year;
	private String color;
	private String plateNo;
	private CarType carType;
	
	public Cars() {
		
	}
	
	public Cars(String plateNo, String color, int year, CarType carType){
		this.year = year;
		this.color = color;
		this.plateNo = plateNo;
		this.carType = carType;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	} 
	
	public String toString(){
		return String.format("%-20s %-12s %-12s %-44s", year, color, plateNo, carType);
    }
	
	
}
