/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.controller;
import java.io.FileWriter;
import java.util.ArrayList;
import neuropsi.dao.ExceptionDAO;
import neuropsi.model.Sintoma;
/**
 *
 * @author 771000343
 */
public class SintomaController {
    public SintomaController() {
    }
    
    public void cadastrarSintoma(String nome,String descricao) throws ExceptionDAO{
        Sintoma s=new Sintoma(nome,descricao);
        s.cadastrarSintoma(s);
    }
    
    public void alterarSintoma(String idsintoma,String nome,String descricao) throws ExceptionDAO{
        Sintoma s=new Sintoma(idsintoma,nome,descricao);
        s.alterarSintoma(s);
    }
    
    public void excluirSintoma(String idsintoma) throws ExceptionDAO{
        Sintoma s=new Sintoma(idsintoma);
        s.excluirSintoma(s);
    }
    
    public ArrayList<Sintoma> listarSintoma(String nome) throws ExceptionDAO{
        Sintoma s=new Sintoma();
        return s.listarSintomas(nome);
    }
    
    /*
    public String mostrarSintomas(int sintomas[],String graus[]){
        String texto="";
        int x=0;
        
        for(int s:sintomas){
            try{
                if(s==1){
                    texto+=mercado.Mercado.listaS()[x].dados();
                    texto+=graus[x]+"\n\n";
                }x+=1;
            }catch(Exception e){
                texto+="\nSINTOMA NÃO CADASTRADO\n";
            }
        }
        
        return texto;
    }
    
    public void gravarSintomas(String texto){
        if(texto!=""){
            try{
                FileWriter fw=new FileWriter("sintomas.txt");
                fw.write(texto);
                fw.close();
            }catch(Exception e){
                System.out.println("Tentando gravar vazio");
            }
        }
    }*/
}
