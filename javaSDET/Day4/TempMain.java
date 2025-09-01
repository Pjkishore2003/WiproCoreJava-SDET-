package pack4;

class Temp{
	    private double celsius;

	    // here setter with validation
	    public void setTemperature(double celsius) {
	        if (celsius >= -273.15) {
	            this.celsius = celsius;
	        } else {
	            System.out.println("Invalid temperature!");
	        }
	    }
	    public double toFahrenheit() {
	        return (celsius * 9 / 5) + 32;
	    }
	    public double toKelvin() {
	        return celsius + 273.15;
	    }
	    public void displayTemperatures() {
	        System.out.println("Celsius: " + celsius + "°C");
	        System.out.println("Fahrenheit: " + toFahrenheit() + "°F");
	        System.out.println("Kelvin: " + toKelvin() + "K");
	    }
	}
		public class TempMain {
		    public static void main(String[] args) {
		        Temp temp1 = new Temp();
		        temp1.setTemperature(25);
		        temp1.displayTemperatures();
		        System.out.println();
		        temp1.setTemperature(-378);     
		        temp1.displayTemperatures();
		    }
		}





