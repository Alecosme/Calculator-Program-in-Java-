
public class Porcentaje extends Ejecutar {
   private double numero1;
private double numero2;
    @Override
    public double execute(double num1, double num2) {
      this.numero1 = num1;
        this.numero2 = num2;
        
        return this.numero1/100;  
}
}