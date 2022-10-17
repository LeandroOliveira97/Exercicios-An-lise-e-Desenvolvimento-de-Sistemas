/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercícios.pkg2.classes.métodos.e.atributos;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class Questao5 {

    public static void main(String[] args) {

        Carros Carro = new Carros();

        Carro.marca = JOptionPane.showInputDialog("Qual sua marca de carro favorita?");
        Carro.modelo = JOptionPane.showInputDialog("Qual seu modelo favorito?");

        System.out.println("Sua marca favorita é " + Carro.marca + " e o modelo é " + Carro.modelo);
        JOptionPane.showMessageDialog(null, "Sua marca favorita é " + Carro.marca + " e o modelo é " + Carro.modelo);

    }

}
