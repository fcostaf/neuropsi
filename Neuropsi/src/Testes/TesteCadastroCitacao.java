/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import neuropsi.view.Telacadastropacientes;
import neuropsi.view.Telatranstornos;

/**
 *
 * @author 771000343
 */
public class TesteCadastroCitacao {
    //private Classe classe;
    private static Telatranstornos t;
    public static void testaCitacao(){
        t=new Telatranstornos();
        String resultadoEsperado="a / b / c / d";
        
        String resultado=t.citacao("a","b","c","d");
        
        if(resultado == null ? resultadoEsperado == null : resultado.equals(resultadoEsperado)){
            System.out.println("Teste ok");
        }else{
            System.out.println("Teste falhou");
        }
    }
    public static void main(String[] args) {
        testaCitacao();
    }
}
