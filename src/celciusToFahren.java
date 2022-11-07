public class celciusToFahren {
    private double value;
    celciusToFahren(double value){
        this.value = value;
    }
    public void convert(){
        double result = ((value * 1.8) + 32);
        System.out.println("Fahrenheit is : " + Math.round(result*10.0)/10.0);
    }

}
