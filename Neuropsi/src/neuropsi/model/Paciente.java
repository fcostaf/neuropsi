package neuropsi.model;

import java.util.ArrayList;
import neuropsi.dao.ExceptionDAO;
import neuropsi.dao.PacienteDAO;

public class Paciente {
    private String idpaciente="";
    private String nome;
    private String sexo;
    private String lateralidade;
    private String dn;
    private String ln;
    private String escolaridade;
    private String curso;
    private String profissao;
    private String estado_civil;
    private String filhos;
    private String comentario;

    public Paciente() {
    }

    public Paciente(String nome, String sexo, String lateralidade, String dn, String ln, String escolaridade, String curso, String profissao, String estado_civil, String filhos, String comentario) {
        this.nome = nome;
        this.sexo = sexo;
        this.lateralidade = lateralidade;
        this.dn = dn;
        this.ln = ln;
        this.escolaridade = escolaridade;
        this.curso = curso;
        this.profissao = profissao;
        this.estado_civil = estado_civil;
        this.filhos = filhos;
        this.comentario = comentario;
    }

    

    public String getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(String idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLateralidade() {
        return lateralidade;
    }

    public void setLateralidade(String lateralidade) {
        this.lateralidade = lateralidade;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getFilhos() {
        return filhos;
    }

    public void setFilhos(String filhos) {
        this.filhos = filhos;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    
    public void cadastrarPaciente(Paciente p) throws ExceptionDAO{
        new PacienteDAO().cadastrarPaciente(p);
    }
    
    public ArrayList<Paciente> listarPaciente(String nome) throws ExceptionDAO{
        return new PacienteDAO().listarPaciente(nome);
    }
}
