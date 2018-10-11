public class Cerchio {
    private double raggio;

    public Cerchio (double raggio){
        this.raggio = raggio;
    }

    public double area (){
        return(raggio*raggio*Math.PI);
    }

    public double perimetro (){
        return(2*raggio*Math.PI);
    }

    public double arrotondare (){
        double temp;
        temp = this.area()*1000;
        temp = Math.round(temp);
        temp = (double) temp/1000;
        return temp;
    }

    public double cilindro (double altezza){
        return(arrotondare()*altezza);
    }

}
