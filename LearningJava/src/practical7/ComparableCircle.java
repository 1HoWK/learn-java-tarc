package practical7;

public class ComparableCircle extends Circle implements Colorable, Comparable{
	
	public ComparableCircle(double radius) {
		super(radius);
	}
	
	public int compareTo(Object o) {
		if(getRadius() > ((ComparableCircle)o).getRadius()) {
			return 1;
		}else if(getRadius() < ((ComparableCircle)o).getRadius()){
			return 2;
		}else{
			return 0;
		}
	}
	
	public String howToColor(int number) {
		if (number == 1)
			return "Make Circle 1 BLUE color and Circle 2 RED color";
		else if (number == 2)
			return "Make Circle 1 RED color and Circle 2 BLUE color";
		else 
			return "Nothing";
	}

}
