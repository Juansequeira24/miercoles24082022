package ejemplouno;

public class variable {

	public static void main(String[] args) {
		
       int n;
       float areaLateral;
       float Pbase,h,longitudLados;
       double anguloCentral,apotema,Abase,areaTotal,volumen;
       
       h=20;
       n=5;
       longitudLados=8.5f;
       Pbase=n*longitudLados;
       areaLateral=Pbase*h;
       
       anguloCentral=(360/n)*(Math.PI/180);
       Double denominador =Math.tan(anguloCentral/2);
       apotema=longitudLados/(2*denominador);
       Abase=(Pbase*apotema)/2;
       areaTotal=areaLateral+2*Abase;
       
       volumen=Abase*h;
       System.out.println("datos del prisma:");
       System.out.println("cantidad de lados:"+n);
       System.out.println("longitud de los lados: "+longitudLados);
       System.out.println("altura:"+h);
       System.out.println("perimetro de la base:"+Pbase);
       System.out.println("Area de la base:"+Abase);
       System.out.println("apotema :"+apotema);
       System.out.println("Area Lateral:"+areaLateral);
       System.out.println("Area Total:"+areaTotal);
       System.out.println("Volumen:"+volumen);
	}

}
