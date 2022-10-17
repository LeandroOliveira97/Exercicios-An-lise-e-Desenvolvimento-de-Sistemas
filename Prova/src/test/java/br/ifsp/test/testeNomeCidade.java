/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.ifsp.test;

import br.edu.ifsp.mavendb.DAOUser;
import br.edu.ifsp.mavendb.TO.TOCity;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AG
 */
public class testeNomeCidade {

    @Test
    public void testaNome() throws Exception {

        DAOUser daouser = new DAOUser();
        daouser.connect();
        TOCity city = new TOCity();
        city = daouser.topOnePop("bra");
        String nome = "São Paulo!!!";
        String isFound = city.getNome();
        assertEquals(nome, isFound);
    }

}
