
import java.util.Scanner;
public class TrabArq {

	private static Scanner var;

	public static void main(String[] args) {
		
        var = new Scanner (System.in);
        
        double imc=var.nextDouble();
        
        System.out.print("Digite o seu peso:");
        double peso=var.nextDouble();
        System.out.print("Digite a altura:");
        double altura=var.nextDouble();
        
        imc=peso*703 /(altura*altura);
        
        if (imc<=18.5){
            System.out.println ("Abaixo do peso");
        }else{
            if ((imc>18.5) && (imc<24.9)){
                System.out.println ("Normal");
            }else{
                if ((imc>25) && (imc<29.9)){
                    System.out.println ("Acima do peso");
                }else{
                    if (imc>30){
                        System.out.println("Obeso");
                    }
                }
            }
        }
        
    }
    
 }