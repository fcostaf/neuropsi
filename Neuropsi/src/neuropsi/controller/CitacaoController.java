/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.controller;

import java.util.ArrayList;
import neuropsi.dao.ExceptionDAO;
import neuropsi.model.Citacao;

/**
 *
 * @author 771000343
 */
public class CitacaoController {

    public CitacaoController() {
    }
    
    public void cadastrarCitacao(String fonte,String descricao) throws ExceptionDAO{
        Citacao c=new Citacao(fonte,descricao);
        c.cadastrarCitacao(c);
    }
    
    public void alterarCitacao(String idcitacao,String fonte,String descricao) throws ExceptionDAO{
        Citacao c=new Citacao(idcitacao,fonte,descricao);
        c.alterarCitacao(c);
    }
    
    public void excluirCitacao(String idcitacao) throws ExceptionDAO{
        Citacao c=new Citacao(idcitacao);
        c.excluirCitacao(c);
    }
    /*
    public ArrayList<Citacao> listarCitacao(String nome) throws ExceptionDAO{
        Citacao c=new Citacao();
        return c.listarCitacao(nome);
    }*/
}
