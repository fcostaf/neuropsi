/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import neuropsi.dao.ExceptionDAO;
import neuropsi.model.Citacao;

/**
 *
 * @author 771000343
 */
public class CitacaoController {

    public CitacaoController() {
    }
    
    public void cadastrarCitacao(String fonte,String descricao,ArrayList<String> tags,String comentarios) throws ExceptionDAO, SQLException{
        Citacao c=new Citacao(fonte,descricao,tags,comentarios);
        c.cadastrarCitacao(c);
    }
    
    public void alterarCitacao(String idcitacao,String fonte,String descricao,ArrayList<String> tags) throws ExceptionDAO, SQLException{
        Citacao c=new Citacao(idcitacao,fonte,descricao,tags);
        c.alterarCitacao(c);
    }
    
    public ArrayList<String> coletarTags(String idcitacao) throws ExceptionDAO{
        Citacao c=new Citacao(idcitacao);
        return c.coletarTags(idcitacao);
    }
    
    public void excluirCitacao(String idcitacao) throws ExceptionDAO{
        Citacao c=new Citacao(idcitacao);
        c.excluirCitacao(c);
    }
    
    public ArrayList<String> listarTags() throws ExceptionDAO{
        Citacao c=new Citacao();
        return c.listarTags();
    }

    public ArrayList<Citacao> listarCitacao() throws ExceptionDAO{
        Citacao c=new Citacao();
        return c.listarCitacao();
    }

    public void excluirTag(String tag) throws ExceptionDAO {
        Citacao c=new Citacao();
        c.excluirTag(tag);
    }

    //public ArrayList<Citacao> filtrarCitacao() {
    //    Citacao c=new Citacao();
    //    return c.filtrarCitacao(tags);
    //}

    public ArrayList<Citacao> filtrarCitacao(Collection<String> tags) {
        String[] variavel={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        for(String tag:tags){
            
        }
        
        Citacao c=new Citacao();
        return c.filtrarCitacao(tags);
        
        
    }
}
