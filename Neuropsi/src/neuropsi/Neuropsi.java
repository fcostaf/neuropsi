package neuropsi;

import javax.swing.JFrame;
import neuropsi.view.telacadastropacientes;

public class Neuropsi {

    public static void main(String[] args) {
        telacadastropacientes t=new telacadastropacientes();
        t.setVisible(true);
        t.setSize(800,800);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static String idpaciente="";
    public static String nome="";
    public static String sexo="";
    public static String lateralidade="";
    public static String dn="";
    public static String ln="";
    public static String escolaridade="";
    public static String curso="";
    public static String profissao="";
    public static String estado_civil="";
    public static String filhos="";
    public static String comentario="";
    
    public static void selecionaDados(String idpacient,String nom,String sex,String lateralidad,String d,String l,String escolaridad,String curs,String profissa,String estadocivil,String filho,String comentari){
        idpaciente=idpacient;
        nome=nom;
        sexo=sex;
        lateralidade=lateralidad;
        dn=d;
        ln=l;
        escolaridade=escolaridad;
        curso=curs;
        profissao=profissa;
        estado_civil=estadocivil;
        filhos=filho;
        comentario=comentari;
    }
}
