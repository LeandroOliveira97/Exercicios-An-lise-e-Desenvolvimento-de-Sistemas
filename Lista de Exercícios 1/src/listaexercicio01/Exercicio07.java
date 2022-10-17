/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicio01;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class Exercicio07 {

    public static void main(String[] args) {

        String nome = null;
        String cpfS;
        int cpf;
        String participante[] = new String[10];
        int cpfParticipante[] = new int[10];

        for (int i = 0; i < 10; i++) {

            nome = JOptionPane.showInputDialog("Digite seu nome: ");
            participante[i] = nome;
            cpfS = JOptionPane.showInputDialog("Digite seu CPF: ");
            cpf = Integer.parseInt(cpfS);
            cpfParticipante[i] = cpf;
        }

        for (int i = 0; i < 10; i++) {

            System.out.println("Participante " + i + " Nome: " + participante[i] + " CPF: " + cpfParticipante[i]);

        }

    }

}
