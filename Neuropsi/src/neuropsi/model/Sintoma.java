/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.model;

import java.util.ArrayList;
import neuropsi.dao.ExceptionDAO;
import neuropsi.dao.SintomaDAO;

/**
 *
 * @author 771000343
 */
public class Sintoma {
    private String idsintoma;
    private String nome;
    private String descricao;

    public Sintoma() {
    }

    public Sintoma(String idsintoma, String nome, String descricao) {
        this.idsintoma = idsintoma;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Sintoma(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Sintoma(String idsintoma) {
        this.idsintoma = idsintoma;
    }
    

    public String getIdsintoma() {
        return idsintoma;
    }

    public void setIdsintoma(String idsintoma) {
        this.idsintoma = idsintoma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public void cadastrarSintoma(Sintoma s) throws ExceptionDAO{
        new SintomaDAO().cadastrarSintoma(s);
    }
    
    public void alterarSintoma(Sintoma s) throws ExceptionDAO{
        new SintomaDAO().alterarSintoma(s);
    }
    
    public void excluirSintoma(Sintoma s) throws ExceptionDAO{
        int idsintoma=Integer.parseInt(s.idsintoma);
        new SintomaDAO().excluirSintoma(idsintoma);
    }
    
    public ArrayList<Sintoma> listarSintomas(String nome) throws ExceptionDAO{
        return new SintomaDAO().listarSintomas(nome);
    }
    
}
