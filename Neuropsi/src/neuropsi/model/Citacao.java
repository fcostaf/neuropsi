/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.model;

import java.util.ArrayList;
import neuropsi.dao.ExceptionDAO;
import neuropsi.dao.CitacaoDAO;
/**
 *
 * @author 771000343
 */
public class Citacao {
    private String idcitacao;
    private String fonte;
    private String descricao;

    public Citacao() {
    }

    public Citacao(String idcitacao) {
        this.idcitacao = idcitacao;
    }

    public Citacao(String fonte, String descricao) {
        this.fonte = fonte;
        this.descricao = descricao;
    }

    public Citacao(String idcitacao, String fonte, String descricao) {
        this.idcitacao = idcitacao;
        this.fonte = fonte;
        this.descricao = descricao;
    }

    public String getIdcitacao() {
        return idcitacao;
    }

    public void setIdcitacao(String idcitacao) {
        this.idcitacao = idcitacao;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarCitacao(Citacao c) throws ExceptionDAO{
        new CitacaoDAO().cadastrarCitacao(c);
    }
    
    public void alterarCitacao(Citacao c) throws ExceptionDAO{
        new CitacaoDAO().alterarCitacao(c);
    }
    
    public void excluirCitacao(Citacao c) throws ExceptionDAO{
        int idcitacao=Integer.parseInt(c.idcitacao);
        new CitacaoDAO().excluirCitacao(idcitacao);
    }
    /*
    public ArrayList<Citacao> listarCitacao(String nome) throws ExceptionDAO{
        return new CitacaoDAO().listarSintomas(nome);
    }*/
}
