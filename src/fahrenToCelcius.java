public class fahrenToCelcius {
    private double value;
    fahrenToCelcius(double value){
        this.value = value;
    }
    public void convert(){
        double result = ((this.value-32)*5/9);
        System.out.println("Celsius is: " + Math.round(result*100.0)/100.0);
    }
}
