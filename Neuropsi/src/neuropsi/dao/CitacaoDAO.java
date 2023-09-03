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
import neuropsi.model.Citacao;
/**
 *
 * @author 771000343
 */
public class CitacaoDAO {
    public void cadastrarCitacao(Citacao c) throws ExceptionDAO, SQLException{
        
        ArrayList<String> tags=c.getTags();
        ArrayList<Integer> idtags=new ArrayList();

        //CADASTRA A CITACAO
        
        String sql="insert into citacao (fonte,descricao) values (?,?)";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1,c.getFonte());
            stmt.setString(2,c.getDescricao());
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
        
        //CADASTRA TAG NAO EXISTENTE
        
        for(String tag:tags){
            String sql1="insert into tag (descricao) values (?)";
            PreparedStatement stmt1=null;
            Connection connection1=null;
            
            //CONFERE SE TAG JA EXISTE
            if(listarTags().contains(tag)){
                
            }else{
                try{
                    connection1=new Conexao().getConnection();
                    stmt1=connection1.prepareStatement(sql1);
                    stmt1.setString(1,tag);
                    stmt1.execute();

                }catch(SQLException e){
                    e.printStackTrace();
                    throw new ExceptionDAO("Erro ao cadastrar tag:"+e);
                }finally{
                    try {if(stmt1!=null){stmt1.close();}
                    }catch (SQLException e){e.printStackTrace();}
                    try {if(connection1 !=null){connection.close();}
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
                        try{if(stmt!=null){stmt.close();}
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
    
    public void alterarCitacao(Citacao c) throws ExceptionDAO{
        String sql="update citacao set fonte=?,descricao=? where idcitacao=?";
        PreparedStatement stmt=null;
        Connection connection=null;
        try{
            connection=new Conexao().getConnection();
            stmt=connection.prepareStatement(sql);
            stmt.setString(1, c.getFonte());
            stmt.setString(2,c.getDescricao());
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
    }
    
    public void excluirCitacao(int id) throws ExceptionDAO{
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
}
