/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.controller;

import neuropsi.dao.ExceptionDAO;
import neuropsi.model.Paciente;

/**
 *
 * @author 771000343
 */
public class PacienteController {

    public PacienteController() {
    }
    public void cadastrarPaciente(String nome,String sexo,String lateralidade,String dn,String ln,String escolaridade,String curso,String profissao,String estado_civil,String filhos) throws ExceptionDAO{
        Paciente p=new Paciente(nome,sexo,lateralidade,dn,ln,escolaridade,curso,profissao,estado_civil,filhos);
        p.cadastrarPaciente(p);
    }
}
