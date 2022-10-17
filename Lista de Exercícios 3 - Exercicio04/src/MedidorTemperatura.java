
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leandro
 */
public class MedidorTemperatura {
    
    public void Temperatura(int valor){
        
        System.out.println("a temperatura atualmente e: "+ valor);
        System.out.println("Digite o valor da temperatura que desejar: ");
        Scanner s = new Scanner(System.in);
        valor = Integer.parseInt(s.nextLine());
        System.out.println("Este é o valor da temperatura que voce digitou: " + valor);
        
    }
    
}
