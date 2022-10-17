
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Leandro
 */
public class Concessionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        
       // Veiculo frota [] = new Veiculo [3];
        
        //for (int i = 0; i < 3; i++) {
            
            
            
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de fabricacao do veiculo: "));
        String marca = JOptionPane.showInputDialog(null, "Digite a marca do veiculo: ");
        String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veiculo: ");
        int preco = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do veiculo: "));

        veiculo.setAno(ano);
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setPreco(preco);
            
            

       // }
       

        JOptionPane.showMessageDialog(null, " Marca: " + veiculo.getMarca() + "\n Modelo: " + veiculo.getModelo() + "\n Ano: " + veiculo.getAno() + "\n Pela bagatela de: " + veiculo.getPreco());
    }

}
