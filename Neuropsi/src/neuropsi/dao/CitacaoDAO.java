/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import neuropsi.model.Citacao;
/**
 *
 * @author 771000343
 */
public class CitacaoDAO {
    public void cadastrarCitacao(Citacao c) throws ExceptionDAO, SQLException{
                
        String sql="insert into citacao (fonte,descricao,comentarios) values (?,?,?)";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1,c.getFonte());
            stmt.setString(2,c.getDescricao());
            stmt.setString(3,c.getComentarios());
            stmt.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao cadastrar citação:"+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
        conectarTagCitacao(c);
        neuropsi.Neuropsi.limpaVariaveis();
    }
        
    public void conectarTagCitacao(Citacao c) throws ExceptionDAO, SQLException{    
        ArrayList<String> tags=c.getTags();
        ArrayList<Integer> idtags=new ArrayList();
        
        //CADASTRA TAG NAO EXISTENTE

        for(String tag:tags){
            String sql="insert into tag (descricao) values (?)";
            PreparedStatement stmt=null;
            Connection connection=null;
            
            //CONFERE SE TAG JA EXISTE
            if(listarTags().contains(tag)){
                
            }else{
                try{
                    connection=new Conexao().getConnection();
                    stmt=connection.prepareStatement(sql);
                    stmt.setString(1,tag);
                    stmt.execute();

                }catch(SQLException e){
                    e.printStackTrace();
                    throw new ExceptionDAO("Erro ao cadastrar tag:"+e);
                }finally{
                    try {if(stmt!=null){stmt.close();}
                    }catch (SQLException e){e.printStackTrace();}
                    try {if(connection !=null){connection.close();}
                    }catch(SQLException e){e.printStackTrace();}
                }
            }
        
            //SELECIONA IDTAG E ADD AO ARRAY IDTAGS
            ResultSet rs4=null;
            PreparedStatement stmt4=null;
            String sql4="select idtag from tag where descricao=?";
            Connection conn4=null;
            conn4=new Conexao().getConnection();
            stmt4=conn4.prepareStatement(sql4);
            stmt4.setString(1,tag);
            rs4=stmt4.executeQuery();
            try{
                if(rs4!=null){
                    while(rs4.next()){
                        idtags.add(rs4.getInt("idtag"));}
                    }
                    }catch(SQLException e) {e.printStackTrace();
                            throw new ExceptionDAO("Erro ao selecionar idtag: "+e);
                    }finally{try{if(rs4!=null){rs4.close();}
                            }catch(SQLException e){e.printStackTrace();}
                            try{if(stmt4!=null){stmt4.close();}
                            }catch(SQLException e){e.printStackTrace();
                            }try{if(conn4!=null){conn4.close();}
                            }catch(Exception e){
                                e.printStackTrace();}
                }
        }
        
        //CONECTA CITACAO COM TAGS
        
        
        
        
        ResultSet rs3=null;
        Connection conn=null;
        PreparedStatement stmt3=null;
        int idcitacao=-1;
        //Citacao c=null;
        //ArrayList<String> listaDeTags=null;
        
        try{
            String sql3="select idcitacao from citacao where descricao=?";
            conn=new Conexao().getConnection();
            stmt3=conn.prepareStatement(sql3);
            stmt3.setString(1, c.getDescricao());
            rs3=stmt3.executeQuery();
            if(rs3!=null){
                while(rs3.next()){
                    idcitacao=rs3.getInt("idcitacao");}
                }
                }catch(SQLException e) {e.printStackTrace();
                        throw new ExceptionDAO("Erro ao selecionar idcitacao: "+e);
                }finally{try{if(rs3!=null){rs3.close();}
                        }catch(SQLException e){e.printStackTrace();}
                        try{if(stmt3!=null){stmt3.close();}
                        }catch(SQLException e){e.printStackTrace();
                        }try{if(conn!=null){conn.close();}
                        }catch(Exception e){
                            e.printStackTrace();}
            }
        
        
        
        
        
        //ArrayList<String> idtags=null;
        
        int n=0;
        for(String tag:tags){
            String sql2="insert into citacao_tag (citacao,tag) values (?,?)";
            PreparedStatement stmt2=null;
            Connection connection2=null;
            

            
            try{
                connection2=new Conexao().getConnection();
                stmt2=connection2.prepareStatement(sql2);
                stmt2.setString(1,Integer.toString(idcitacao));
                stmt2.setString(2, Integer.toString(idtags.get(n)));
                stmt2.execute();
                n+=1;

            }catch(SQLException e){
                e.printStackTrace();
                throw new ExceptionDAO("Erro ao conectar citacao_tag:"+e);
            }finally{
                try {if(stmt2!=null){stmt2.close();}
                }catch (SQLException e){e.printStackTrace();}
                try {if(connection2 !=null){connection2.close();}
                }catch(SQLException e){e.printStackTrace();}
            }
        }

    }
    
    public void alterarCitacao(Citacao c) throws ExceptionDAO, SQLException{
        excluirCitacaoTag(Integer.parseInt(c.getIdcitacao()));
        String sql="update citacao set fonte=?,descricao=? where idcitacao=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        ArrayList<String> tagsAntigas=coletarTags(c.getIdcitacao());
        ArrayList<String> tagsAcrescentar=null;
        ArrayList<String> tagsExcluir=null;
        for(String tag:c.getTags()){
            if(tagsAntigas.contains(tag)){
                
            }else{
                
            }
        }
        
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1, c.getFonte());
            stmt.setString(2,c.getDescricao());
            stmt.setString(3,c.getIdcitacao());
            stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao alterar citação: "+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
        conectarTagCitacao(c);
    }
    public void excluirCitacaoTag(int id) throws ExceptionDAO{
        String sql="delete from citacao_tag where citacao=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao excluir citacao_tag: "+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    public void excluirCitacao(int id) throws ExceptionDAO{
        excluirCitacaoTag(id);
        String sql="delete from citacao where idcitacao=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao excluir citacao: "+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public void excluirTag(String tag) throws ExceptionDAO{
        int idTag=getIdTag(tag);
        String sql="delete from tag where idtag=?";
        String sql1="delete from citacao_tag where tag=?";
        PreparedStatement stmt=null;
        PreparedStatement stmt1=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt1=connection.prepareStatement(sql1);
            stmt1.setInt(1, getIdTag(tag));
            stmt1.execute();
            
            stmt=connection.prepareStatement(sql);
            stmt.setInt(1, idTag);
            stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO("Erro ao excluir citacao: "+e);
        }finally{
            try {if(stmt!=null){stmt.close();}
            }catch (SQLException e){e.printStackTrace();}
            try {if(connection !=null){connection.close();}
            }catch(SQLException e){e.printStackTrace();}
        }
    }
    
    public ArrayList<String> listarTags() throws ExceptionDAO{
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement stmt=null;
        Citacao c=null;
        ArrayList<String> listaDeTags=null;
        
        try{
            String sql="select descricao from tag order by descricao";
            conn=new Conexao().getConnection();
            stmt=conn.prepareStatement(sql);
            rs=stmt.executeQuery();
            if(rs!=null){
                listaDeTags=new ArrayList<>();
                while(rs.next()){
                    listaDeTags.add(rs.getString("descricao"));}}
                }catch(SQLException e) {e.printStackTrace();
                        throw new ExceptionDAO("Erro ao listar sintomas: "+e);
                }finally{try{if(rs!=null){rs.close();}
                        }catch(SQLException e){e.printStackTrace();}
                        try{if(stmt!=null){stmt.close();}
                        }catch(SQLException e){e.printStackTrace();
                        }try{if(conn!=null){conn.close();}
                        }catch(Exception e){
                            e.printStackTrace();}
            }return listaDeTags;
    }
    
    public ArrayList<Citacao> listarCitacao() throws ExceptionDAO{
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement stmt=null;
        Citacao c=null;
        ArrayList<Citacao> listaDeCitacao=null;
        
        try{
            String sql="select * from citacao";
            conn=new Conexao().getConnection();
            stmt=conn.prepareStatement(sql);
            rs=stmt.executeQuery();
            if(rs!=null){
                listaDeCitacao=new ArrayList<>();
                while(rs.next()){
                    c=new Citacao();
                    c.setIdcitacao(rs.getString("idcitacao"));
                    c.setFonte(rs.getString("fonte"));
                    c.setDescricao(rs.getString("descricao"));
                    c.setComentarios(rs.getString("comentarios"));
                    listaDeCitacao.add(c);}}
                }catch(SQLException e) {e.printStackTrace();
                        throw new ExceptionDAO("Erro ao listar citações: "+e);
                }finally{try{if(rs!=null){rs.close();}
                        }catch(SQLException e){e.printStackTrace();}
                        try{if(stmt!=null){stmt.close();}
                        }catch(SQLException e){e.printStackTrace();
                        }try{if(conn!=null){conn.close();}
                        }catch(Exception e){
                            e.printStackTrace();}
            }return listaDeCitacao;
    }

    public ArrayList<Integer> coletarIdTags(String idcitacao) throws ExceptionDAO {
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement stmt=null;
        ArrayList<Integer> listaDeIdTags=null;
        try{
            String sql="select tag from citacao_tag where citacao=?";
            conn=new Conexao().getConnection();
            stmt=conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(idcitacao));
            rs=stmt.executeQuery();
            if(rs!=null){
                listaDeIdTags=new ArrayList<>();
                while(rs.next()){
                    listaDeIdTags.add(rs.getInt("tag"));}}
                }catch(SQLException e) {e.printStackTrace();
                        throw new ExceptionDAO("Erro ao coletar idtags: "+e);
                }finally{try{if(rs!=null){rs.close();}
                        }catch(SQLException e){e.printStackTrace();}
                        try{if(stmt!=null){stmt.close();}
                        }catch(SQLException e){e.printStackTrace();
                        }try{if(conn!=null){conn.close();}
                        }catch(Exception e){
                            e.printStackTrace();}}
            return listaDeIdTags;
    }

    public ArrayList<String> coletarTags(String idcitacao) throws ExceptionDAO {
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement stmt=null;
        ArrayList<Integer> listaDeIdTags=coletarIdTags(idcitacao);
        ArrayList<String> listaDeTags=null;
        listaDeTags=new ArrayList<>();
        for(int idtag:listaDeIdTags){
            try{
                String sql="select descricao from tag where idtag=?";
                conn=new Conexao().getConnection();
                stmt=conn.prepareStatement(sql);
                stmt.setInt(1, idtag);
                rs=stmt.executeQuery();
                if(rs!=null){
                    
                    while(rs.next()){
                        listaDeTags.add(rs.getString("descricao"));}}
                    }catch(SQLException e) {e.printStackTrace();
                            throw new ExceptionDAO("Erro ao coletar tags: "+e);
                    }finally{try{if(rs!=null){rs.close();}
                            }catch(SQLException e){e.printStackTrace();}
                            try{if(stmt!=null){stmt.close();}
                            }catch(SQLException e){e.printStackTrace();
                            }try{if(conn!=null){conn.close();}
                            }catch(Exception e){
                                e.printStackTrace();}}
            }return listaDeTags;
    }
    
    public int getIdTag(String tag) throws ExceptionDAO{
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement stmt=null;
        int idTag=0;
        try{
            String sql="select idtag from tag where descricao=?";
            conn=new Conexao().getConnection();
            stmt=conn.prepareStatement(sql);
            stmt.setString(1, tag);
            rs=stmt.executeQuery();
            if(rs!=null){
                    while(rs.next()){
                        idTag=rs.getInt("idtag");}}
        }catch(SQLException e){e.printStackTrace();
                throw new ExceptionDAO("Erro no getIdTag: "+e);
        }finally{try{if(rs!=null){rs.close();}
                }catch(SQLException e){e.printStackTrace();}
                try{if(stmt!=null){stmt.close();}
                }catch(SQLException e){e.printStackTrace();
                }try{if(conn!=null){conn.close();}
                }catch(Exception e){
                    e.printStackTrace();}}
        return idTag;
    }

    /*public ArrayList<String> filtrarCitacao(String tag) throws ExceptionDAO {
        ArrayList<Citacao> listaDeCitacoes=null;
        listaDeCitacoes=new ArrayList<>();
        ArrayList<String> idtags=new ArrayList<>();
        for(String tag:tags){
            idtags.add(Integer.toString(getIdTag(tag)));
        }
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement stmt=null;
        Citacao c=null;
        
        ArrayList<String> idcitacoes=new ArrayList<>();
        for(String idtag:idtags){
            try{
                String sql="select * from citacao_tag where tag="+idtag;
                conn=new Conexao().getConnection();
                stmt=conn.prepareStatement(sql);
                rs=stmt.executeQuery();
                if(rs!=null){
                    while(rs.next()){
                        idcitacoes.add(Integer.toString(rs.getInt("citacao")));
                    }
                }
                    }catch(SQLException e) {e.printStackTrace();
                            throw new ExceptionDAO("Erro ao listar paciente: "+e);
                    }finally{try{if(rs!=null){rs.close();}
                            }catch(SQLException e){e.printStackTrace();}
                            try{if(stmt!=null){stmt.close();}
                            }catch(SQLException e){e.printStackTrace();
                            }try{if(conn!=null){conn.close();}
                            }catch(Exception e){
                                e.printStackTrace();}
                            }
            }
        return listaDeCitacoes;
        //c=new Citacao();
        //c.setIdcitacao(rs.getString("idpaciente"));
    }*/
}
