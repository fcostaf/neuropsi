package neuropsi;

import javax.swing.JFrame;
import neuropsi.view.Telaavaliacao;
import neuropsi.view.Telacadastropacientes;
import neuropsi.view.Telainicial;
import neuropsi.view.Telatranstornos;

public class Neuropsi {

    public static void main(String[] args) {
        tinit.setVisible(true);
        tinit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tcad.getjButtonAlterar().setEnabled(false);
        tcad.getjButtonExcluir().setEnabled(false);
        ttra.getjButtonAlterar().setEnabled(false);
        ttra.getjButtonExcluir().setEnabled(false);
        ttra.getjButtonAlterar1().setEnabled(false);
        ttra.getjButtonExcluir1().setEnabled(false);
        
        
        
    }
    public static Telacadastropacientes tcad=new Telacadastropacientes();
    public static Telainicial tinit=new Telainicial();
    public static Telaavaliacao tava=new Telaavaliacao();
    public static Telatranstornos ttra=new Telatranstornos();
    
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
    
    public static String idsintoma="";
    public static String descricao="";
    
    public static String table1="";
    public static String table2="";
    public static String table3="";
    public static String table4="";
    
    public static void selecionaDados(String idpacient,String nom,String sex,String lateralidad,
            String d,String l,String escolaridad,String curs,String profissa,String estadocivil,
            String filho,String comentari){
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
    
    public static void selecionaDadosSintoma(String idsintom,String nom,String descrica){
        idsintoma=idsintom;
        nome=nom;
        descricao=descrica;
    }
    
    public static void selecionaDadosGeral(String campo1,String campo2,String campo3){
        table1=campo1;
        table2=campo2;
        table3=campo3;
    }
}
